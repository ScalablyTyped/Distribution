package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XStyleSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  var Style: XStyle
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  def getStyle(): XStyle
  /** @param xStyle If you want to remove an existing style, you can set an empty (null) object. Otherwise, the object given must support the service Property */
  def setStyle(xStyle: XStyle): scala.Unit
}

object XStyleSupplier {
  @scala.inline
  def apply(
    Style: XStyle,
    acquire: js.Function0[scala.Unit],
    getStyle: js.Function0[XStyle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setStyle: js.Function1[XStyle, scala.Unit]
  ): XStyleSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStyle")(getStyle)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setStyle")(setStyle)
    __obj.asInstanceOf[XStyleSupplier]
  }
}

