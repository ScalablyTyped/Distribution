package typings.activexDashLibreoffice.comNs.sunNs.starNs.packagesNs.zipNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to get reading access to non-encrypted entries inside zip file. */
trait ZipFileAccess extends XZipFileAccess2 {
  def createWithURL(URL: String): Unit
}

object ZipFileAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    createWithURL: String => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getStreamByPattern: String => XInputStream,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ZipFileAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createWithURL = js.Any.fromFunction1(createWithURL), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ZipFileAccess]
  }
}

