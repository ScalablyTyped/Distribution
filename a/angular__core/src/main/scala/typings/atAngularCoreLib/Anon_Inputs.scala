package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inputs[T] extends js.Object {
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
  var inputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_Inputs with js.Any
  ] = js.undefined
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
  var outputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_Inputs with js.Any
  ] = js.undefined
}

object Anon_Inputs {
  @scala.inline
  def apply[T](
    inputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_Inputs with js.Any = null,
    outputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_Inputs with js.Any = null
  ): Anon_Inputs[T] = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    __obj.asInstanceOf[Anon_Inputs[T]]
  }
}

