package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemingProvider extends StObject {
  
  def alwaysWatchTheme(alwaysWatch: Boolean): Unit = js.native
  
  def configuration(): IThemeConfig = js.native
  
  def definePalette(name: String, palette: IPalette): IThemingProvider = js.native
  
  def disableTheming(): Unit = js.native
  def disableTheming(isDisabled: Boolean): Unit = js.native
  
  def enableBrowserColor(browserColors: IBrowserColors): js.Function0[Unit] = js.native
  
  def extendPalette(name: String, palette: IPalette): IPalette = js.native
  
  def generateThemesOnDemand(onDemand: Boolean): Unit = js.native
  
  def registerStyles(styles: String): Unit = js.native
  
  def setDefaultTheme(theme: String): Unit = js.native
  
  def setNonce(nonce: String): Unit = js.native
  
  def theme(name: String): ITheme = js.native
  def theme(name: String, inheritFrom: String): ITheme = js.native
}
