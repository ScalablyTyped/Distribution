package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateS3ResourcesRequest extends StObject {
  
  /**
    * (Discontinued) The ID of the Amazon Macie Classic member account whose resources you want to associate with Macie Classic.
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * (Discontinued) The S3 resources that you want to associate with Amazon Macie Classic for monitoring and data classification.
    */
  var s3Resources: S3ResourcesClassification
}
object AssociateS3ResourcesRequest {
  
  inline def apply(s3Resources: S3ResourcesClassification): AssociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3Resources = s3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateS3ResourcesRequest]
  }
  
  extension [Self <: AssociateS3ResourcesRequest](x: Self) {
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
    
    inline def setS3Resources(value: S3ResourcesClassification): Self = StObject.set(x, "s3Resources", value.asInstanceOf[js.Any])
    
    inline def setS3ResourcesVarargs(value: S3ResourceClassification*): Self = StObject.set(x, "s3Resources", js.Array(value*))
  }
}
