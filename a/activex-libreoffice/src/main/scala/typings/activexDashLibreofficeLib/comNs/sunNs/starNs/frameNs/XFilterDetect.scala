package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XFilterDetect
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getContentType(URL: java.lang.String): java.lang.String
  def useExternBrowser(URL: java.lang.String): scala.Boolean
}

object XFilterDetect {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getContentType: java.lang.String => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    useExternBrowser: java.lang.String => scala.Boolean
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getContentType = js.Any.fromFunction1(getContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), useExternBrowser = js.Any.fromFunction1(useExternBrowser))
  
    __obj.asInstanceOf[XFilterDetect]
  }
}

