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
    acquire: js.Function0[scala.Unit],
    getContentType: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    useExternBrowser: js.Function1[java.lang.String, scala.Boolean]
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = acquire, getContentType = getContentType, queryInterface = queryInterface, release = release, useExternBrowser = useExternBrowser)
  
    __obj.asInstanceOf[XFilterDetect]
  }
}

