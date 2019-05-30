package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentQueries[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[atAngularCoreLib.atAngularCoreMod.ContentQueriesFunction[T] | scala.Null] = js.undefined
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
  var inputs: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_ContentQueries with js.Any
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
  var outputs: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_ContentQueries with js.Any
  ] = js.undefined
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[atAngularCoreLib.atAngularCoreMod.ViewQueriesFunction[T] | scala.Null] = js.undefined
}

object Anon_ContentQueries {
  @scala.inline
  def apply[T](
    contentQueries: atAngularCoreLib.atAngularCoreMod.ContentQueriesFunction[T] = null,
    inputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_ContentQueries with js.Any = null,
    outputs: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ atAngularCoreLib.atAngularCoreLibStrings.Anon_ContentQueries with js.Any = null,
    viewQuery: atAngularCoreLib.atAngularCoreMod.ViewQueriesFunction[T] = null
  ): Anon_ContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(contentQueries)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(viewQuery)
    __obj.asInstanceOf[Anon_ContentQueries[T]]
  }
}

