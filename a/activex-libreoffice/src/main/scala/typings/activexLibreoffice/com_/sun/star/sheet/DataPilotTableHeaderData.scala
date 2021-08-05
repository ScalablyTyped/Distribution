package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait DataPilotTableHeaderData extends StObject {
  
  /** number of dimensions */
  var Dimension: Double
  
  /** flag */
  var Flags: Double
  
  /** hierarchy */
  var Hierarchy: Double
  
  /** level */
  var Level: Double
  
  /** member name */
  var MemberName: String
}
object DataPilotTableHeaderData {
  
  inline def apply(Dimension: Double, Flags: Double, Hierarchy: Double, Level: Double, MemberName: String): DataPilotTableHeaderData = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Hierarchy = Hierarchy.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableHeaderData]
  }
  
  extension [Self <: DataPilotTableHeaderData](x: Self) {
    
    inline def setDimension(value: Double): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setHierarchy(value: Double): Self = StObject.set(x, "Hierarchy", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setMemberName(value: String): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
  }
}
