package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers the capability to extract the XML document stream from a document storage. */
trait XXMLExtractor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * extracts the XML stream from the document storage.
    * @returns the extracted XML stream.
    */
  def extract(aStream: XInputStream): XInputStream
}

