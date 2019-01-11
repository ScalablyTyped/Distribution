package typings
package atAngularCoreLib.srcRender3ComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val NULL_INJECTOR: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def LifecycleHooksFeature(component: js.Any, `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]): scala.Unit = js.native
  def createRootComponent[T](
    componentView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rootContext: atAngularCoreLib.srcRender3InterfacesViewMod.RootContext
  ): js.Any = js.native
  def createRootComponent[T](
    componentView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[T],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rootContext: atAngularCoreLib.srcRender3InterfacesViewMod.RootContext,
    hostFeatures: js.Array[atAngularCoreLib.srcRender3ComponentMod.HostFeature]
  ): js.Any = js.native
  def createRootComponentView(
    rNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def createRootComponentView(
    rNode: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def createRootComponentView(
    rNode: scala.Null,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def createRootComponentView(
    rNode: scala.Null,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_],
    rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    rendererFactory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3,
    renderer: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3,
    sanitizer: atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def createRootContext(): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def createRootContext(scheduler: js.Function1[/* workFn */ js.Function0[scala.Unit], scala.Unit]): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def createRootContext(
    scheduler: js.Function1[/* workFn */ js.Function0[scala.Unit], scala.Unit],
    playerHandler: atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerHandler
  ): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T]): T = js.native
  def renderComponent[T](
    componentType: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentType[T],
    opts: atAngularCoreLib.srcRender3ComponentMod.CreateComponentOptions
  ): T = js.native
  def renderComponent[T](componentType: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def renderComponent[T](
    componentType: atAngularCoreLib.srcTypeMod.Type[T],
    opts: atAngularCoreLib.srcRender3ComponentMod.CreateComponentOptions
  ): T = js.native
  def whenRendered(component: js.Any): js.Promise[scala.Null] = js.native
}

