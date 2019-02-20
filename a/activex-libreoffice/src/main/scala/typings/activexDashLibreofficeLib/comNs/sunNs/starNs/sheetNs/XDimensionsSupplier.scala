package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of dimensions of a data pilot source.
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XDimensionsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  val Dimensions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the collection of dimensions.
    * @see com.sun.star.sheet.DataPilotSourceDimensions
    */
  def getDimensions(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

