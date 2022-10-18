package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelNameCondition extends StObject {
  
  /**
    * A comparison operator. Currently, you can only specify the BEGINS_WITH operator, which finds signaling channels whose names begin with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ComparisonOperator] = js.undefined
  
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[ChannelName] = js.undefined
}
object ChannelNameCondition {
  
  inline def apply(): ChannelNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelNameCondition]
  }
  
  extension [Self <: ChannelNameCondition](x: Self) {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setComparisonValue(value: ChannelName): Self = StObject.set(x, "ComparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "ComparisonValue", js.undefined)
  }
}
