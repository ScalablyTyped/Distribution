package typings.angularCore

import typings.angularCore.angularCoreStrings.Anon_ContentQueries
import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentQueries[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T] | Null] = js.undefined
  /**
    * Function executed by the parent template to allow children to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.undefined
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ Anon_ContentQueries with js.Any
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ Anon_ContentQueries with js.Any
  ] = js.undefined
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.undefined
}

object AnonContentQueries {
  @scala.inline
  def apply[T](
    contentQueries: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit = null,
    hostBindings: (/* rf */ ɵRenderFlags, T, /* elementIndex */ Double) => Unit = null,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ Anon_ContentQueries with js.Any = null,
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ Anon_ContentQueries with js.Any = null,
    viewQuery: (/* rf */ ɵRenderFlags, T) => Unit = null
  ): AnonContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(js.Any.fromFunction3(contentQueries))
    if (hostBindings != null) __obj.updateDynamic("hostBindings")(js.Any.fromFunction3(hostBindings))
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(js.Any.fromFunction2(viewQuery))
    __obj.asInstanceOf[AnonContentQueries[T]]
  }
}

