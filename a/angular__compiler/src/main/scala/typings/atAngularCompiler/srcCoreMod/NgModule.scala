package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModule extends js.Object {
  var bootstrap: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var declarations: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var entryComponents: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var exports: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imports: js.UndefOr[js.Array[Type | ModuleWithProviders | js.Array[_]]] = js.undefined
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[_]]] = js.undefined
}

object NgModule {
  @scala.inline
  def apply(
    bootstrap: js.Array[Type | js.Array[_]] = null,
    declarations: js.Array[Type | js.Array[_]] = null,
    entryComponents: js.Array[Type | js.Array[_]] = null,
    exports: js.Array[Type | js.Array[_]] = null,
    id: String = null,
    imports: js.Array[Type | ModuleWithProviders | js.Array[_]] = null,
    providers: js.Array[Provider] = null,
    schemas: js.Array[SchemaMetadata | js.Array[_]] = null
  ): NgModule = {
    val __obj = js.Dynamic.literal()
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap)
    if (declarations != null) __obj.updateDynamic("declarations")(declarations)
    if (entryComponents != null) __obj.updateDynamic("entryComponents")(entryComponents)
    if (exports != null) __obj.updateDynamic("exports")(exports)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[NgModule]
  }
}

