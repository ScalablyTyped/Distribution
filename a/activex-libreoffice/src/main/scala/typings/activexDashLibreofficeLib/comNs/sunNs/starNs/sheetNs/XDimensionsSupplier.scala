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

object XDimensionsSupplier {
  @scala.inline
  def apply(
    Dimensions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getDimensions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDimensionsSupplier = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions, acquire = acquire, getDimensions = getDimensions, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDimensionsSupplier]
  }
}

