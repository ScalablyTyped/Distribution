package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeConfig extends js.Object {
  var alwaysWatchTheme: scala.Boolean
  var defaultTheme: java.lang.String
  var disableTheming: scala.Boolean
  var generateOnDemand: scala.Boolean
  var nonce: java.lang.String
  var registeredStyles: js.Array[java.lang.String]
}

object IThemeConfig {
  @scala.inline
  def apply(
    alwaysWatchTheme: scala.Boolean,
    defaultTheme: java.lang.String,
    disableTheming: scala.Boolean,
    generateOnDemand: scala.Boolean,
    nonce: java.lang.String,
    registeredStyles: js.Array[java.lang.String]
  ): IThemeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysWatchTheme")(alwaysWatchTheme)
    __obj.updateDynamic("defaultTheme")(defaultTheme)
    __obj.updateDynamic("disableTheming")(disableTheming)
    __obj.updateDynamic("generateOnDemand")(generateOnDemand)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("registeredStyles")(registeredStyles)
    __obj.asInstanceOf[IThemeConfig]
  }
}

