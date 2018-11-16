package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/jit/module", JSImport.Namespace)
@js.native
object srcRender3JitModuleMod extends js.Object {
  def compileNgModule(
    moduleType: atAngularCoreLib.srcTypeMod.Type[_],
    ngModule: atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModule
  ): scala.Unit = js.native
  def compileNgModuleDefs(
    moduleType: atAngularCoreLib.srcTypeMod.Type[_],
    ngModule: atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModule
  ): scala.Unit = js.native
  def patchComponentDefWithScope[C](
    componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[C],
    transitiveScopes: atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModuleTransitiveScopes
  ): scala.Unit = js.native
  def transitiveScopesFor[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModuleTransitiveScopes = js.native
}

