package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Outputs[T] extends js.Object {
  /**
       * A map of input names.
       *
       * The format is in: `{[actualPropertyName: string]:(string|[string, string])}`.
       *
       * Given:
       * ```
       * class MyComponent {
       *   @Input()
       *   publicInput1: string;
       *
       *   @Input('publicInput2')
       *   declaredInput2: string;
       * }
       * ```
       *
       * is described as:
       * ```
       * {
       *   publicInput1: 'publicInput1',
       *   declaredInput2: ['declaredInput2', 'publicInput2'],
       * }
       * ```
       *
       * Which the minifier may translate to:
       * ```
       * {
       *   minifiedPublicInput1: 'publicInput1',
       *   minifiedDeclaredInput2: [ 'declaredInput2', 'publicInput2'],
       * }
       * ```
       *
       * This allows the render to re-construct the minified, public, and declared names
       * of properties.
       *
       * NOTE:
       *  - Because declared and public name are usually same we only generate the array
       *    `['declared', 'public']` format when they differ.
       *  - The reason why this API and `outputs` API is not the same is that `NgOnChanges` has
       *    inconsistent behavior in that it uses declared names rather than minified or public. For
       *    this reason `NgOnChanges` will be deprecated and removed in future version and this
       *    API will be simplified to be consistent with `outputs`.
       */
  var inputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Outputs with js.Any] = js.undefined
  /**
       * A map of output names.
       *
       * The format is in: `{[actualPropertyName: string]:string}`.
       *
       * Which the minifier may translate to: `{[minifiedPropertyName: string]:string}`.
       *
       * This allows the render to re-construct the minified and non-minified names
       * of properties.
       */
  var outputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Outputs with js.Any] = js.undefined
}

