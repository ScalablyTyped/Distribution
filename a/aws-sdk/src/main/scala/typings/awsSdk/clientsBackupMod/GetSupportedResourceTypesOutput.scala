package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSupportedResourceTypesOutput extends StObject {
  
  /**
    * Contains a string with the supported Amazon Web Services resource types:    Aurora for Amazon Aurora    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    FSX for Amazon FSx    RDS for Amazon Relational Database Service    Storage Gateway for Storage Gateway    DocDB for Amazon DocumentDB (with MongoDB compatibility)    Neptune for Amazon Neptune  
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceTypes] = js.undefined
}
object GetSupportedResourceTypesOutput {
  
  inline def apply(): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
  
  extension [Self <: GetSupportedResourceTypesOutput](x: Self) {
    
    inline def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
  }
}
