package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetAdvisorCollectorResponse extends StObject {
  
  /**
    * The name of the new Fleet Advisor collector.
    */
  var CollectorName: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the new Fleet Advisor collector, for example: 22fda70c-40d5-4acf-b233-a495bd8eb7f5 
    */
  var CollectorReferencedId: js.UndefOr[String] = js.undefined
  
  /**
    * A summary description of the Fleet Advisor collector.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket that the collector uses to store inventory metadata.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM role that grants permissions to access the specified Amazon S3 bucket.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
}
object CreateFleetAdvisorCollectorResponse {
  
  inline def apply(): CreateFleetAdvisorCollectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetAdvisorCollectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFleetAdvisorCollectorResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectorName(value: String): Self = StObject.set(x, "CollectorName", value.asInstanceOf[js.Any])
    
    inline def setCollectorNameUndefined: Self = StObject.set(x, "CollectorName", js.undefined)
    
    inline def setCollectorReferencedId(value: String): Self = StObject.set(x, "CollectorReferencedId", value.asInstanceOf[js.Any])
    
    inline def setCollectorReferencedIdUndefined: Self = StObject.set(x, "CollectorReferencedId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
  }
}
