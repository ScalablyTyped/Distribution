package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemingService extends js.Object {
  var PALETTES: IConfiguredColorPalette = js.native
   // get only
  var THEMES: IConfiguredThemes = js.native
   // get only
  def apply(element: angularLib.JQuery): scala.Unit = js.native
  def defaultTheme(): java.lang.String = js.native
  def defineTheme(name: java.lang.String, options: IDefineThemeOptions): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def generateTheme(name: java.lang.String): scala.Unit = js.native
  def registered(themeName: java.lang.String): scala.Boolean = js.native
  def setBrowserColor(options: IBrowserColors): js.Function0[scala.Unit] = js.native
}

