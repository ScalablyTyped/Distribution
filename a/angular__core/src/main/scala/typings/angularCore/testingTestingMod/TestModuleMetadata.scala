package typings.angularCore.testingTestingMod

import typings.angularCore.mod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestModuleMetadata extends js.Object {
  var aotSummaries: js.UndefOr[js.Function0[js.Array[_]]] = js.native
  var declarations: js.UndefOr[js.Array[_]] = js.native
  var imports: js.UndefOr[js.Array[_]] = js.native
  var providers: js.UndefOr[js.Array[_]] = js.native
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[_]]] = js.native
}

object TestModuleMetadata {
  @scala.inline
  def apply(): TestModuleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestModuleMetadata]
  }
  @scala.inline
  implicit class TestModuleMetadataOps[Self <: TestModuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAotSummaries(value: () => js.Array[_]): Self = this.set("aotSummaries", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAotSummaries: Self = this.set("aotSummaries", js.undefined)
    @scala.inline
    def setDeclarationsVarargs(value: js.Any*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[_]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    @scala.inline
    def setImportsVarargs(value: js.Any*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[_]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[_]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: (SchemaMetadata | js.Array[js.Any])*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata | js.Array[_]]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
  
}

