package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers the capability to extract the XML document stream from a document storage. */
trait XXMLExtractor extends XInterface {
  /**
    * extracts the XML stream from the document storage.
    * @returns the extracted XML stream.
    */
  def extract(aStream: XInputStream): XInputStream
}

object XXMLExtractor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    extract: XInputStream => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXMLExtractor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), extract = js.Any.fromFunction1(extract), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XXMLExtractor]
  }
}

