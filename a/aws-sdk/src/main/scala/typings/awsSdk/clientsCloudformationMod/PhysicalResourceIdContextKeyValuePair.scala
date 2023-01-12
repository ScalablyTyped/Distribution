package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalResourceIdContextKeyValuePair extends StObject {
  
  /**
    * The resource context key.
    */
  var Key: typings.awsSdk.clientsCloudformationMod.Key
  
  /**
    * The resource context value.
    */
  var Value: typings.awsSdk.clientsCloudformationMod.Value
}
object PhysicalResourceIdContextKeyValuePair {
  
  inline def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalResourceIdContextKeyValuePair] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
