package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * information about a cell within the column or row header area of a DataPilot table.
  *
  * This struct contains information about a particular cell located within the column or row header area of a DataPilot table. This is the type that is
  * contained in {@link DataPilotTablePositionData.PositionData} when the value of {@link DataPilotTablePositionData.PositionType} is either {@link
  * DataPilotTablePositionType.ROW_HEADER} or {@link DataPilotTablePositionType.COLUMN_HEADER} .
  * @see com.sun.star.sheet.DataPilotTablePositionData
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPilotFieldFilter
  * @see com.sun.star.sheet.DataResult
  * @since OOo 3.0
  */
trait DataPilotTableHeaderData extends js.Object {
  /** number of dimensions */
  var Dimension: scala.Double
  /** flag */
  var Flags: scala.Double
  /** hierarchy */
  var Hierarchy: scala.Double
  /** level */
  var Level: scala.Double
  /** member name */
  var MemberName: java.lang.String
}

object DataPilotTableHeaderData {
  @scala.inline
  def apply(
    Dimension: scala.Double,
    Flags: scala.Double,
    Hierarchy: scala.Double,
    Level: scala.Double,
    MemberName: java.lang.String
  ): DataPilotTableHeaderData = {
    val __obj = js.Dynamic.literal(Dimension = Dimension, Flags = Flags, Hierarchy = Hierarchy, Level = Level, MemberName = MemberName)
  
    __obj.asInstanceOf[DataPilotTableHeaderData]
  }
}

