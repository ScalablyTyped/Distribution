package typings.angularPlatformBrowser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularPlatformBrowser.anon.CssProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "HammerGestureConfig")
@js.native
open class HammerGestureConfig () extends StObject {
  
  /**
    * Creates a [HammerJS Manager](https://hammerjs.github.io/api/#hammermanager)
    * and attaches it to a given HTML element.
    * @param element The element that will recognize gestures.
    * @returns A HammerJS event-manager object.
    */
  def buildHammer(element: HTMLElement): HammerInstance = js.native
  
  /**
    * A set of supported event names for gestures to be used in Angular.
    * Angular supports all built-in recognizers, as listed in
    * [HammerJS documentation](https://hammerjs.github.io/).
    */
  var events: js.Array[String] = js.native
  
  /**
    * Properties whose default values can be overridden for a given event.
    * Different sets of properties apply to different events.
    * For information about which properties are supported for which events,
    * and their allowed and default values, see
    * [HammerJS documentation](https://hammerjs.github.io/).
    */
  var options: js.UndefOr[CssProps] = js.native
  
  /**
    * Maps gesture event names to a set of configuration options
    * that specify overrides to the default values for specific properties.
    *
    * The key is a supported event name to be configured,
    * and the options object contains a set of properties, with override values
    * to be applied to the named recognizer event.
    * For example, to disable recognition of the rotate event, specify
    *  `{"rotate": {"enable": false}}`.
    *
    * Properties that are not present take the HammerJS default values.
    * For information about which properties are supported for which events,
    * and their allowed and default values, see
    * [HammerJS documentation](https://hammerjs.github.io/).
    *
    */
  var overrides: StringDictionary[js.Object] = js.native
}
/* static members */
object HammerGestureConfig {
  
  @JSImport("@angular/platform-browser", "HammerGestureConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "HammerGestureConfig.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HammerGestureConfig, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HammerGestureConfig, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "HammerGestureConfig.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[HammerGestureConfig] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[HammerGestureConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
