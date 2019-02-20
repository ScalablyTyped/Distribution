package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is an extension to the interface {@link XSimpleFileAccess} . */
trait XSimpleFileAccess2 extends XSimpleFileAccess {
  /**
    * Overwrites the file content with the given data.
    *
    * If the file does not exist, it will be created.
    * @param FileURL File to write
    * @param data A stream containing the data for the file to be (over-)written
    */
  def writeFile(FileURL: java.lang.String, data: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
}

