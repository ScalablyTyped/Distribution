package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataProtectionPolicyInput extends StObject {
  
  /**
    * The ARN of the topic whose DataProtectionPolicy you want to get. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: topicARN
}
object GetDataProtectionPolicyInput {
  
  inline def apply(ResourceArn: topicARN): GetDataProtectionPolicyInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataProtectionPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataProtectionPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: topicARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
