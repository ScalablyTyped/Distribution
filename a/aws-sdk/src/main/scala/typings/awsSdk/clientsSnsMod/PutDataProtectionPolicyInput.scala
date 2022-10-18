package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataProtectionPolicyInput extends StObject {
  
  /**
    * The JSON serialization of the topic's DataProtectionPolicy. The DataProtectionPolicy must be in JSON string format. Length Constraints: Maximum length of 30,720.
    */
  var DataProtectionPolicy: attributeValue
  
  /**
    * The ARN of the topic whose DataProtectionPolicy you want to add or update. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: topicARN
}
object PutDataProtectionPolicyInput {
  
  inline def apply(DataProtectionPolicy: attributeValue, ResourceArn: topicARN): PutDataProtectionPolicyInput = {
    val __obj = js.Dynamic.literal(DataProtectionPolicy = DataProtectionPolicy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataProtectionPolicyInput]
  }
  
  extension [Self <: PutDataProtectionPolicyInput](x: Self) {
    
    inline def setDataProtectionPolicy(value: attributeValue): Self = StObject.set(x, "DataProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: topicARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
