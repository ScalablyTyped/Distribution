package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to get reading access to non-encrypted entries inside zip file. */
trait ZipFileAccess extends XZipFileAccess2 {
  def createWithURL(URL: java.lang.String): scala.Unit
}

object ZipFileAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createWithURL: js.Function1[java.lang.String, scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getStreamByPattern: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ZipFileAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, createWithURL = createWithURL, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getStreamByPattern = getStreamByPattern, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ZipFileAccess]
  }
}

