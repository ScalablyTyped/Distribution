package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterInstanceEventNotificationAttributesResult extends StObject {
  
  /**
    * The resulting set of tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.undefined
}
object DeregisterInstanceEventNotificationAttributesResult {
  
  inline def apply(): DeregisterInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterInstanceEventNotificationAttributesResult]
  }
  
  extension [Self <: DeregisterInstanceEventNotificationAttributesResult](x: Self) {
    
    inline def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
