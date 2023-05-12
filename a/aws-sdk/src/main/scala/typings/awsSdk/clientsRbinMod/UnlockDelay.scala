package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlockDelay extends StObject {
  
  /**
    * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
    */
  var UnlockDelayUnit: typings.awsSdk.clientsRbinMod.UnlockDelayUnit
  
  /**
    * The unlock delay period, measured in the unit specified for  UnlockDelayUnit.
    */
  var UnlockDelayValue: typings.awsSdk.clientsRbinMod.UnlockDelayValue
}
object UnlockDelay {
  
  inline def apply(UnlockDelayUnit: UnlockDelayUnit, UnlockDelayValue: UnlockDelayValue): UnlockDelay = {
    val __obj = js.Dynamic.literal(UnlockDelayUnit = UnlockDelayUnit.asInstanceOf[js.Any], UnlockDelayValue = UnlockDelayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlockDelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnlockDelay] (val x: Self) extends AnyVal {
    
    inline def setUnlockDelayUnit(value: UnlockDelayUnit): Self = StObject.set(x, "UnlockDelayUnit", value.asInstanceOf[js.Any])
    
    inline def setUnlockDelayValue(value: UnlockDelayValue): Self = StObject.set(x, "UnlockDelayValue", value.asInstanceOf[js.Any])
  }
}
