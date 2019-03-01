package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the style settings of a component */
trait XStyleSettingsSupplier extends js.Object {
  var StyleSettings: XStyleSettings
}

object XStyleSettingsSupplier {
  @scala.inline
  def apply(StyleSettings: XStyleSettings): XStyleSettingsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StyleSettings")(StyleSettings)
    __obj.asInstanceOf[XStyleSettingsSupplier]
  }
}

