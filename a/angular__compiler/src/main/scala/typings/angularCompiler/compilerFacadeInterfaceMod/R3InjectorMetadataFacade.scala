package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3InjectorMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  var imports: js.Array[_] = js.native
  var name: String = js.native
  var providers: js.Array[_] = js.native
  var `type`: js.Any = js.native
}

object R3InjectorMetadataFacade {
  @scala.inline
  def apply(imports: js.Array[_], name: String, providers: js.Array[_], `type`: js.Any): R3InjectorMetadataFacade = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadataFacade]
  }
  @scala.inline
  implicit class R3InjectorMetadataFacadeOps[Self <: R3InjectorMetadataFacade] (val x: Self) extends AnyVal {
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
    def setImportsVarargs(value: js.Any*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[_]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[_]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
  }
  
}

