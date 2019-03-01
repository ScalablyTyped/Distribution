package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptor for a single text markup.
  * @since OOo 3.0.1
  */
trait TextMarkupDescriptor extends js.Object {
  var aIdentifier: java.lang.String
  var nLength: scala.Double
  var nOffset: scala.Double
  var nType: scala.Double
  var xMarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
}

object TextMarkupDescriptor {
  @scala.inline
  def apply(
    aIdentifier: java.lang.String,
    nLength: scala.Double,
    nOffset: scala.Double,
    nType: scala.Double,
    xMarkupInfoContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XStringKeyMap
  ): TextMarkupDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aIdentifier")(aIdentifier)
    __obj.updateDynamic("nLength")(nLength)
    __obj.updateDynamic("nOffset")(nOffset)
    __obj.updateDynamic("nType")(nType)
    __obj.updateDynamic("xMarkupInfoContainer")(xMarkupInfoContainer)
    __obj.asInstanceOf[TextMarkupDescriptor]
  }
}

