package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/styling/util", JSImport.Namespace)
@js.native
object srcRender3StylingUtilMod extends js.Object {
  val EMPTY_ARR: js.Array[js.Any] = js.native
  def allocStylingContext(
    element: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    templateStyleContext: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def allocStylingContext(
    element: scala.Null,
    templateStyleContext: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(element: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    sanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    sanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    initialStylingValues: atAngularCoreLib.srcRender3InterfacesStylingMod.InitialStyles
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement,
    sanitizer: scala.Null,
    initialStylingValues: atAngularCoreLib.srcRender3InterfacesStylingMod.InitialStyles
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: scala.Null,
    sanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn,
    initialStylingValues: atAngularCoreLib.srcRender3InterfacesStylingMod.InitialStyles
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def createEmptyStylingContext(
    element: scala.Null,
    sanitizer: scala.Null,
    initialStylingValues: atAngularCoreLib.srcRender3InterfacesStylingMod.InitialStyles
  ): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  def getOrCreatePlayerContext(target: js.Object): atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerContext = js.native
  def getOrCreatePlayerContext(target: js.Object, context: atAngularCoreLib.srcRender3InterfacesContextMod.LContext): atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayerContext = js.native
  def getStylingContext(index: scala.Double, viewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext = js.native
  @js.native
  object EMPTY_OBJ
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any]
  
}

