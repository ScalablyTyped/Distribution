package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpendLimit extends StObject {
  
  /**
    * The maximum amount of money, in US dollars, that you want to be able to spend sending messages each month. This value has to be less than or equal to the amount in MaxLimit. To use this custom limit, Overridden must be set to true.
    */
  var EnforcedLimit: PrimitiveLong
  
  /**
    *  The maximum amount of money that you are able to spend to send messages each month, in US dollars.
    */
  var MaxLimit: PrimitiveLong
  
  /**
    * The name for the SpendLimit.
    */
  var Name: SpendLimitName
  
  /**
    * When set to True, the value that has been specified in the EnforcedLimit is used to determine the maximum amount in US dollars that can be spent to send messages each month, in US dollars.
    */
  var Overridden: PrimitiveBoolean
}
object SpendLimit {
  
  inline def apply(
    EnforcedLimit: PrimitiveLong,
    MaxLimit: PrimitiveLong,
    Name: SpendLimitName,
    Overridden: PrimitiveBoolean
  ): SpendLimit = {
    val __obj = js.Dynamic.literal(EnforcedLimit = EnforcedLimit.asInstanceOf[js.Any], MaxLimit = MaxLimit.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Overridden = Overridden.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpendLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpendLimit] (val x: Self) extends AnyVal {
    
    inline def setEnforcedLimit(value: PrimitiveLong): Self = StObject.set(x, "EnforcedLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxLimit(value: PrimitiveLong): Self = StObject.set(x, "MaxLimit", value.asInstanceOf[js.Any])
    
    inline def setName(value: SpendLimitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOverridden(value: PrimitiveBoolean): Self = StObject.set(x, "Overridden", value.asInstanceOf[js.Any])
  }
}
