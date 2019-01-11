package typings
package atAngularCoreLib.srcRender3DiscoveryUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/discovery_utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getComponent[T](element: stdLib.Element): T | scala.Null = js.native
  def getContext[T](element: stdLib.Element): T | scala.Null = js.native
  def getDirectives(target: js.Object): js.Array[js.Object] = js.native
  def getHostElement[T](directive: T): stdLib.Element = js.native
  def getInjectionTokens(element: stdLib.Element): js.Array[_] = js.native
  def getInjector(target: js.Object): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def getListeners(element: stdLib.Element): js.Array[atAngularCoreLib.srcRender3DiscoveryUnderscoreUtilsMod.Listener] = js.native
  def getLocalRefs(target: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getRenderedText(component: js.Any): java.lang.String = js.native
  def getRootComponents(target: js.Object): js.Array[_] = js.native
  def getRootContext(target: atAngularCoreLib.srcRender3InterfacesViewMod.LView): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootContext(target: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootView(componentOrView: atAngularCoreLib.srcRender3InterfacesViewMod.LView): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getRootView(componentOrView: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getViewComponent[T](element: js.Object): T | scala.Null = js.native
  def getViewComponent[T](element: stdLib.Element): T | scala.Null = js.native
  def isBrowserEvents(listener: atAngularCoreLib.srcRender3DiscoveryUnderscoreUtilsMod.Listener): scala.Boolean = js.native
  def loadLContext(target: js.Object): atAngularCoreLib.srcRender3InterfacesContextMod.LContext = js.native
  def loadLContext(target: js.Object, throwOnNotFound: atAngularCoreLib.atAngularCoreLibNumbers.`false`): atAngularCoreLib.srcRender3InterfacesContextMod.LContext | scala.Null = js.native
  def loadLContextFromNode(node: stdLib.Node): atAngularCoreLib.srcRender3InterfacesContextMod.LContext = js.native
}

