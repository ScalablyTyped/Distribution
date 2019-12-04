package typings.antd

import typings.antd.libIconMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/icon/utils", JSImport.Namespace)
@js.native
object libIconUtilsMod extends js.Object {
  def alias(`type`: String): String = js.native
  def getThemeFromTypeName(`type`: String): ThemeType | Null = js.native
  def removeTypeTheme(`type`: String): String = js.native
  def withThemeSuffix(`type`: String, theme: ThemeType): String = js.native
  @js.native
  object svgBaseProps extends js.Object {
    var `aria-hidden`: Boolean = js.native
    var fill: String = js.native
    var focusable: String = js.native
    var height: String = js.native
    var width: String = js.native
  }
  
}

