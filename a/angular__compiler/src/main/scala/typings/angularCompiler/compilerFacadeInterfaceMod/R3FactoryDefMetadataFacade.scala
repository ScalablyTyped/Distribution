package typings.angularCompiler.compilerFacadeInterfaceMod

import typings.angularCompiler.angularCompilerStrings.directiveInject
import typings.angularCompiler.angularCompilerStrings.inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3FactoryDefMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  var injectFn: directiveInject | inject = js.native
  var name: String = js.native
  var target: R3FactoryTarget = js.native
  var `type`: js.Any = js.native
  var typeArgumentCount: Double = js.native
}

object R3FactoryDefMetadataFacade {
  @scala.inline
  def apply(
    injectFn: directiveInject | inject,
    name: String,
    target: R3FactoryTarget,
    `type`: js.Any,
    typeArgumentCount: Double
  ): R3FactoryDefMetadataFacade = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryDefMetadataFacade]
  }
  @scala.inline
  implicit class R3FactoryDefMetadataFacadeOps[Self <: R3FactoryDefMetadataFacade] (val x: Self) extends AnyVal {
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
    def setInjectFn(value: directiveInject | inject): Self = this.set("injectFn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: R3FactoryTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = this.set("typeArgumentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
  }
  
}

