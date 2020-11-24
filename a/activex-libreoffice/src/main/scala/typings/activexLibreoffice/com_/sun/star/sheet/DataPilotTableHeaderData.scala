package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait DataPilotTableHeaderData extends js.Object {
  
  /** number of dimensions */
  var Dimension: Double = js.native
  
  /** flag */
  var Flags: Double = js.native
  
  /** hierarchy */
  var Hierarchy: Double = js.native
  
  /** level */
  var Level: Double = js.native
  
  /** member name */
  var MemberName: String = js.native
}
object DataPilotTableHeaderData {
  
  @scala.inline
  def apply(Dimension: Double, Flags: Double, Hierarchy: Double, Level: Double, MemberName: String): DataPilotTableHeaderData = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Hierarchy = Hierarchy.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableHeaderData]
  }
  
  @scala.inline
  implicit class DataPilotTableHeaderDataOps[Self <: DataPilotTableHeaderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimension(value: Double): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchy(value: Double): Self = this.set("Hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberName(value: String): Self = this.set("MemberName", value.asInstanceOf[js.Any])
  }
}
