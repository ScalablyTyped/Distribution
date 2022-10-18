package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterInstanceEventNotificationAttributesResult extends StObject {
  
  /**
    * The resulting set of tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.undefined
}
object RegisterInstanceEventNotificationAttributesResult {
  
  inline def apply(): RegisterInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceEventNotificationAttributesResult]
  }
  
  extension [Self <: RegisterInstanceEventNotificationAttributesResult](x: Self) {
    
    inline def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
