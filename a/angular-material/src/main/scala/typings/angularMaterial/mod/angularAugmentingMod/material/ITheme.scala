package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITheme extends js.Object {
  
  def accentPalette(name: String): ITheme = js.native
  def accentPalette(name: String, hues: IThemeHues): ITheme = js.native
  
  def backgroundPalette(name: String): ITheme = js.native
  def backgroundPalette(name: String, hues: IThemeHues): ITheme = js.native
  
  var colors: IThemeColors = js.native
  
  def dark(): ITheme = js.native
  def dark(isDark: Boolean): ITheme = js.native
  
  var foregroundPalette: IThemeGrayScalePalette = js.native
  
  var foregroundShadow: String = js.native
  
  var isDark: Boolean = js.native
  
  var name: String = js.native
  
  def primaryPalette(name: String): ITheme = js.native
  def primaryPalette(name: String, hues: IThemeHues): ITheme = js.native
  
  def warnPalette(name: String): ITheme = js.native
  def warnPalette(name: String, hues: IThemeHues): ITheme = js.native
}
