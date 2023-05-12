package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookbackWindow extends StObject {
  
  /**
    * The name of the lookback window column.
    */
  var ColumnName: String
  
  /**
    * The lookback window column size.
    */
  var Size: PositiveLong
  
  /**
    * The size unit that is used for the lookback window column. Valid values for this structure are HOUR, DAY, and WEEK.
    */
  var SizeUnit: LookbackWindowSizeUnit
}
object LookbackWindow {
  
  inline def apply(ColumnName: String, Size: PositiveLong, SizeUnit: LookbackWindowSizeUnit): LookbackWindow = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeUnit = SizeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbackWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookbackWindow] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: String): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setSize(value: PositiveLong): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUnit(value: LookbackWindowSizeUnit): Self = StObject.set(x, "SizeUnit", value.asInstanceOf[js.Any])
  }
}
