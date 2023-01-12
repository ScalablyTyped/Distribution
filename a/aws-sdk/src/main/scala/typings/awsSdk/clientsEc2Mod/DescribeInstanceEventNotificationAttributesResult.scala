package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceEventNotificationAttributesResult extends StObject {
  
  /**
    * Information about the registered tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.undefined
}
object DescribeInstanceEventNotificationAttributesResult {
  
  inline def apply(): DescribeInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceEventNotificationAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceEventNotificationAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
