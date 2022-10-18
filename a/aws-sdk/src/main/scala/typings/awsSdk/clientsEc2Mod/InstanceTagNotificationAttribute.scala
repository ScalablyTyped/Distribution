package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTagNotificationAttribute extends StObject {
  
  /**
    * Indicates wheter all tag keys in the current Region are registered to appear in scheduled event notifications. true indicates that all tag keys in the current Region are registered.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The registered tag keys.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.undefined
}
object InstanceTagNotificationAttribute {
  
  inline def apply(): InstanceTagNotificationAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTagNotificationAttribute]
  }
  
  extension [Self <: InstanceTagNotificationAttribute](x: Self) {
    
    inline def setIncludeAllTagsOfInstance(value: Boolean): Self = StObject.set(x, "IncludeAllTagsOfInstance", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllTagsOfInstanceUndefined: Self = StObject.set(x, "IncludeAllTagsOfInstance", js.undefined)
    
    inline def setInstanceTagKeys(value: InstanceTagKeySet): Self = StObject.set(x, "InstanceTagKeys", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagKeysUndefined: Self = StObject.set(x, "InstanceTagKeys", js.undefined)
    
    inline def setInstanceTagKeysVarargs(value: String*): Self = StObject.set(x, "InstanceTagKeys", js.Array(value*))
  }
}
