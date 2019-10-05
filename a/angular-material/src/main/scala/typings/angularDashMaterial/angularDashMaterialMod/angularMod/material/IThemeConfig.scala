package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

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
    val __obj = js.Dynamic.literal(alwaysWatchTheme = alwaysWatchTheme, defaultTheme = defaultTheme, disableTheming = disableTheming, generateOnDemand = generateOnDemand, nonce = nonce, registeredStyles = registeredStyles)
  
    __obj.asInstanceOf[IThemeConfig]
  }
}

