package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XFilterDetect extends XInterface {
  def getContentType(URL: String): String
  def useExternBrowser(URL: String): Boolean
}

object XFilterDetect {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getContentType: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    useExternBrowser: String => Boolean
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getContentType = js.Any.fromFunction1(getContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), useExternBrowser = js.Any.fromFunction1(useExternBrowser))
  
    __obj.asInstanceOf[XFilterDetect]
  }
}

