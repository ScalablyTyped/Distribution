package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanConditionPair extends StObject {
  
  /**
    * Represents key  in the map condition.
    */
  var Key: TagKey
  
  /**
    * Represents optional value  in the map condition. If not specified, only key  will be matched.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}
object ScanConditionPair {
  
  inline def apply(Key: TagKey): ScanConditionPair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanConditionPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanConditionPair] (val x: Self) extends AnyVal {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
