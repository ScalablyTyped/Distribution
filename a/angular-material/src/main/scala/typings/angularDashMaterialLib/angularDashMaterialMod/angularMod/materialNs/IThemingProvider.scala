package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemingProvider extends js.Object {
  def alwaysWatchTheme(alwaysWatch: scala.Boolean): scala.Unit = js.native
  def configuration(): IThemeConfig = js.native
  def definePalette(name: java.lang.String, palette: IPalette): IThemingProvider = js.native
  def disableTheming(): scala.Unit = js.native
  def disableTheming(isDisabled: scala.Boolean): scala.Unit = js.native
  def enableBrowserColor(browserColors: IBrowserColors): js.Function0[scala.Unit] = js.native
  def extendPalette(name: java.lang.String, palette: IPalette): IPalette = js.native
  def generateThemesOnDemand(onDemand: scala.Boolean): scala.Unit = js.native
  def registerStyles(styles: java.lang.String): scala.Unit = js.native
  def setDefaultTheme(theme: java.lang.String): scala.Unit = js.native
  def setNonce(nonce: java.lang.String): scala.Unit = js.native
  def theme(name: java.lang.String): ITheme = js.native
  def theme(name: java.lang.String, inheritFrom: java.lang.String): ITheme = js.native
}

