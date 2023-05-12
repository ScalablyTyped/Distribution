package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRangeFilterConstant extends StObject {
  
  /**
    * The data type of the constant value that is used in a range filter. Valid values for this structure are RANGE.
    */
  var ConstantType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ConstantType] = js.undefined
  
  /**
    * The value of the constant that is used to specify the endpoints of a range filter.
    */
  var RangeConstant: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RangeConstant] = js.undefined
}
object TopicRangeFilterConstant {
  
  inline def apply(): TopicRangeFilterConstant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRangeFilterConstant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicRangeFilterConstant] (val x: Self) extends AnyVal {
    
    inline def setConstantType(value: ConstantType): Self = StObject.set(x, "ConstantType", value.asInstanceOf[js.Any])
    
    inline def setConstantTypeUndefined: Self = StObject.set(x, "ConstantType", js.undefined)
    
    inline def setRangeConstant(value: RangeConstant): Self = StObject.set(x, "RangeConstant", value.asInstanceOf[js.Any])
    
    inline def setRangeConstantUndefined: Self = StObject.set(x, "RangeConstant", js.undefined)
  }
}
