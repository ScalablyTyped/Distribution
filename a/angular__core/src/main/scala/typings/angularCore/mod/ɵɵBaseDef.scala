package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵɵBaseDef[T] extends js.Object {
  /**
    * Function to create and refresh content queries associated with a given directive.
    */
  var contentQueries: ContentQueriesFunction[T] | Null
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any
  /**
    * Refreshes host bindings on the associated directive.
    */
  var hostBindings: HostBindingsFunction[T] | Null
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any
  /**
    * Query-related instructions for a directive. Note that while directives don't have a
    * view and as such view queries won't necessarily do anything, there might be
    * components that extend the directive.
    */
  var viewQuery: ViewQueriesFunction[T] | Null
}

object ɵɵBaseDef {
  @scala.inline
  def apply[T](
    declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any,
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typings.angularCore.angularCoreStrings.ɵɵBaseDef with js.Any,
    contentQueries: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit = null,
    hostBindings: (/* rf */ ɵRenderFlags, T, /* elementIndex */ Double) => Unit = null,
    viewQuery: (/* rf */ ɵRenderFlags, T) => Unit = null
  ): ɵɵBaseDef[T] = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(js.Any.fromFunction3(contentQueries))
    if (hostBindings != null) __obj.updateDynamic("hostBindings")(js.Any.fromFunction3(hostBindings))
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(js.Any.fromFunction2(viewQuery))
    __obj.asInstanceOf[ɵɵBaseDef[T]]
  }
}

