package typings.angularCompiler.compilerFacadeInterfaceMod

import typings.angularCompiler.anon.NameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function] = js.native
  var declarations: js.Array[js.Function] = js.native
  var exports: js.Array[js.Function] = js.native
  var id: String | Null = js.native
  var imports: js.Array[js.Function] = js.native
  var schemas: js.Array[NameString] | Null = js.native
  var `type`: js.Any = js.native
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
  @scala.inline
  implicit class R3NgModuleMetadataFacadeOps[Self <: R3NgModuleMetadataFacade] (val x: Self) extends AnyVal {
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
    def setBootstrapVarargs(value: js.Function*): Self = this.set("bootstrap", js.Array(value :_*))
    @scala.inline
    def setBootstrap(value: js.Array[js.Function]): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclarationsVarargs(value: js.Function*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[js.Function]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportsVarargs(value: js.Function*): Self = this.set("exports", js.Array(value :_*))
    @scala.inline
    def setExports(value: js.Array[js.Function]): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: js.Function*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[js.Function]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setSchemasVarargs(value: NameString*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[NameString]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
  }
  
}

