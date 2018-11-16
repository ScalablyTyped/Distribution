package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITheme extends js.Object {
  var colors: IThemeColors = js.native
  var foregroundPalette: IThemeGrayScalePalette = js.native
  var foregroundShadow: java.lang.String = js.native
  var isDark: scala.Boolean = js.native
  var name: java.lang.String = js.native
  def accentPalette(name: java.lang.String): ITheme = js.native
  def accentPalette(name: java.lang.String, hues: IThemeHues): ITheme = js.native
  def backgroundPalette(name: java.lang.String): ITheme = js.native
  def backgroundPalette(name: java.lang.String, hues: IThemeHues): ITheme = js.native
  def dark(): ITheme = js.native
  def dark(isDark: scala.Boolean): ITheme = js.native
  def primaryPalette(name: java.lang.String): ITheme = js.native
  def primaryPalette(name: java.lang.String, hues: IThemeHues): ITheme = js.native
  def warnPalette(name: java.lang.String): ITheme = js.native
  def warnPalette(name: java.lang.String, hues: IThemeHues): ITheme = js.native
}

