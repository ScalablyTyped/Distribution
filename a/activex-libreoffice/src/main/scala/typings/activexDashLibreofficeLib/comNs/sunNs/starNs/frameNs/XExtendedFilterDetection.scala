package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XExtendedFilterDetection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * use {@link com.sun.star.document.XExtendedFilterDetection.detect()} instead of this
    * @deprecated Deprecated
    */
  def detect(
    URL: java.lang.String,
    Argumentlist: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): java.lang.String
}

object XExtendedFilterDetection {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    detect: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal(acquire = acquire, detect = detect, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
}

