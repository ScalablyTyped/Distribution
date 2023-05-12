package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericEqualityDrillDownFilter extends StObject {
  
  /**
    * The column that the filter is applied to.
    */
  var Column: ColumnIdentifier
  
  /**
    * The value of the double input numeric drill down filter.
    */
  var Value: Double
}
object NumericEqualityDrillDownFilter {
  
  inline def apply(Column: ColumnIdentifier, Value: Double): NumericEqualityDrillDownFilter = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericEqualityDrillDownFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericEqualityDrillDownFilter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
