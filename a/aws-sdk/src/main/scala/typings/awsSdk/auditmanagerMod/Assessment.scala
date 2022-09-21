package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assessment extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the assessment. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The Amazon Web Services account that's associated with the assessment. 
    */
  var awsAccount: js.UndefOr[AWSAccount] = js.undefined
  
  /**
    *  The framework that the assessment was created from. 
    */
  var framework: js.UndefOr[AssessmentFramework] = js.undefined
  
  /**
    *  The metadata for the assessment. 
    */
  var metadata: js.UndefOr[AssessmentMetadata] = js.undefined
  
  /**
    *  The tags that are associated with the assessment. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Assessment {
  
  inline def apply(): Assessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assessment]
  }
  
  extension [Self <: Assessment](x: Self) {
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAwsAccount(value: AWSAccount): Self = StObject.set(x, "awsAccount", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountUndefined: Self = StObject.set(x, "awsAccount", js.undefined)
    
    inline def setFramework(value: AssessmentFramework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setMetadata(value: AssessmentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
