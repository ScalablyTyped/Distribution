package typings
package atAngularCoreLib.srcRender3ComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/component", JSImport.Namespace)
@js.native
object srcRender3ComponentModMembers extends js.Object {
  val NULL_INJECTOR: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def LifecycleHooksFeature(component: js.Any, `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]): scala.Unit = js.native
  def createRootComponent[T](
    componentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    rootContext: atAngularCoreLib.srcRender3InterfacesViewMod.RootContext
  ): js.Any = js.native
  def createRootComponent[T](
    componentView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    rootContext: atAngularCoreLib.srcRender3InterfacesViewMod.RootContext,
    hostFeatures: js.Array[HostFeature]
  ): js.Any = js.native
  def createRootComponentView(
    rNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createRootComponentView(
    rNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createRootComponentView(
    rNode: scala.Null,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createRootComponentView(
    rNode: scala.Null,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def createRootContext(): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def createRootContext(scheduler: js.Function1[/* workFn */ js.Function0[scala.Unit], scala.Unit]): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def createRootContext(
    scheduler: js.Function1[/* workFn */ js.Function0[scala.Unit], scala.Unit],
    playerHandler: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerHandler
  ): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T]): T = js.native
  def renderComponent[T](
    componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T],
    opts: CreateComponentOptions
  ): T = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcTypeMod.Type[T], opts: CreateComponentOptions): T = js.native
  def whenRendered(component: js.Any): js.Promise[scala.Null] = js.native
}

