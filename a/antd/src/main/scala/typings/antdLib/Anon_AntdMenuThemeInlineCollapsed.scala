package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AntdMenuThemeInlineCollapsed extends js.Object {
  var antdMenuTheme: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var inlineCollapsed: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
}

object Anon_AntdMenuThemeInlineCollapsed {
  @scala.inline
  def apply(
    antdMenuTheme: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    inlineCollapsed: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  ): Anon_AntdMenuThemeInlineCollapsed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("antdMenuTheme")(antdMenuTheme)
    __obj.updateDynamic("inlineCollapsed")(inlineCollapsed)
    __obj.asInstanceOf[Anon_AntdMenuThemeInlineCollapsed]
  }
}

