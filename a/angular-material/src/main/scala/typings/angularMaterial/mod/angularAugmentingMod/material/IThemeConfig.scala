package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeConfig extends js.Object {
  var alwaysWatchTheme: Boolean
  var defaultTheme: String
  var disableTheming: Boolean
  var generateOnDemand: Boolean
  var nonce: String
  var registeredStyles: js.Array[String]
}

object IThemeConfig {
  @scala.inline
  def apply(
    alwaysWatchTheme: Boolean,
    defaultTheme: String,
    disableTheming: Boolean,
    generateOnDemand: Boolean,
    nonce: String,
    registeredStyles: js.Array[String]
  ): IThemeConfig = {
    val __obj = js.Dynamic.literal(alwaysWatchTheme = alwaysWatchTheme.asInstanceOf[js.Any], defaultTheme = defaultTheme.asInstanceOf[js.Any], disableTheming = disableTheming.asInstanceOf[js.Any], generateOnDemand = generateOnDemand.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], registeredStyles = registeredStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeConfig]
  }
}

