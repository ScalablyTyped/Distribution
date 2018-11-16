package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/definition", JSImport.Namespace)
@js.native
object srcRender3DefinitionMod extends js.Object {
  val EMPTY_ARRAY: js.Array[js.Any] = js.native
  val defineDirective: js.Function1[/* directiveDefinition */ atAngularCoreLib.Anon_Features[js.Any], scala.Nothing] = js.native
  def defineBase[T](baseDefinition: atAngularCoreLib.Anon_Outputs[T]): atAngularCoreLib.srcRender3InterfacesDefinitionMod.BaseDef[T] = js.native
  def defineComponent[T](componentDefinition: atAngularCoreLib.Anon_Directives[T]): scala.Nothing = js.native
  def defineNgModule[T](
    `def`: atAngularCoreLib.Anon_TypeT[T] with stdLib.Partial[atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModuleDef[T]]
  ): scala.Nothing = js.native
  def definePipe[T](pipeDef: atAngularCoreLib.Anon_Type[T]): scala.Nothing = js.native
  def extractDirectiveDef(
    `type`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveType[_] with atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[_]
  ): atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_] | atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_] = js.native
  def extractPipeDef(`type`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeType[_]): atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDef[_] = js.native
  def getComponentDef[T](`type`: js.Any): atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T] | scala.Null = js.native
  def getDirectiveDef[T](`type`: js.Any): atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[T] | scala.Null = js.native
  def getNgModuleDef[T](`type`: js.Any): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.NgModuleDef[T] | scala.Null = js.native
  def getPipeDef[T](`type`: js.Any): atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeDef[T] | scala.Null = js.native
}

