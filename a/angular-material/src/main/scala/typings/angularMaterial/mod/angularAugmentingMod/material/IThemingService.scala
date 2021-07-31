package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.JQuery
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemingService extends StObject {
  
  // get only
  def apply(element: JQuery): Unit = js.native
  
  var PALETTES: IConfiguredColorPalette = js.native
  
  // get only
  var THEMES: IConfiguredThemes = js.native
  
  def defaultTheme(): String = js.native
  
  def defineTheme(name: String, options: IDefineThemeOptions): IPromise[String] = js.native
  
  def generateTheme(name: String): Unit = js.native
  
  def registered(themeName: String): Boolean = js.native
  
  def setBrowserColor(options: IBrowserColors): js.Function0[Unit] = js.native
}
