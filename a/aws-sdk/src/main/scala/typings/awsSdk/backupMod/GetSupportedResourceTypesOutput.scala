package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSupportedResourceTypesOutput extends StObject {
  
  /**
    * Contains a string with the supported AWS resource types:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.backupMod.ResourceTypes] = js.undefined
}
object GetSupportedResourceTypesOutput {
  
  @scala.inline
  def apply(): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
  
  @scala.inline
  implicit class GetSupportedResourceTypesOutputMutableBuilder[Self <: GetSupportedResourceTypesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
  }
}
