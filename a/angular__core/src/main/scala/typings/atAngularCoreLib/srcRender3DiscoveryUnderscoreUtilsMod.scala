package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/discovery_utils", JSImport.Namespace)
@js.native
object srcRender3DiscoveryUnderscoreUtilsMod extends js.Object {
  def getComponent[T](element: stdLib.Element): T | scala.Null = js.native
  def getDirectives(target: js.Object): js.Array[js.Object] = js.native
  def getHostElement[T](directive: T): stdLib.Element = js.native
  def getInjector(target: js.Object): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def getLocalRefs(target: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getRenderedText(component: js.Any): java.lang.String = js.native
  def getRootComponents(target: js.Object): js.Array[_] = js.native
  def getRootContext(target: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootContext(target: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootView(componentOrView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getRootView(componentOrView: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getViewComponent[T](element: js.Object): T | scala.Null = js.native
  def getViewComponent[T](element: stdLib.Element): T | scala.Null = js.native
  def loadContext(target: js.Object): atAngularCoreLib.srcRender3InterfacesContextMod.LContext = js.native
}

