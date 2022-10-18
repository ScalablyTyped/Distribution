package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConformancePackRequest extends StObject {
  
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConformancePackInputParameters] = js.undefined
  
  /**
    * The unique name of the conformance pack you want to deploy.
    */
  var ConformancePackName: typings.awsSdk.clientsConfigserviceMod.ConformancePackName
  
  /**
    * The name of the Amazon S3 bucket where Config stores conformance pack templates.  This field is optional. 
    */
  var DeliveryS3Bucket: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.DeliveryS3Bucket] = js.undefined
  
  /**
    * The prefix for the Amazon S3 bucket.   This field is optional. 
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.DeliveryS3KeyPrefix] = js.undefined
  
  /**
    * A string containing the full conformance pack template body. The structure containing the template body has a minimum length of 1 byte and a maximum length of 51,200 bytes.  You can only use a YAML template with two resource types: Config rule (AWS::Config::ConfigRule) and remediation action (AWS::Config::RemediationConfiguration). 
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.TemplateBody] = js.undefined
  
  /**
    * The location of the file containing the template body (s3://bucketname/prefix). The uri must point to a conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the conformance pack.   You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.TemplateS3Uri] = js.undefined
  
  /**
    * An object of type TemplateSSMDocumentDetails, which contains the name or the Amazon Resource Name (ARN) of the Amazon Web Services Systems Manager document (SSM document) and the version of the SSM document that is used to create a conformance pack.
    */
  var TemplateSSMDocumentDetails: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.TemplateSSMDocumentDetails] = js.undefined
}
object PutConformancePackRequest {
  
  inline def apply(ConformancePackName: ConformancePackName): PutConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConformancePackRequest]
  }
  
  extension [Self <: PutConformancePackRequest](x: Self) {
    
    inline def setConformancePackInputParameters(value: ConformancePackInputParameters): Self = StObject.set(x, "ConformancePackInputParameters", value.asInstanceOf[js.Any])
    
    inline def setConformancePackInputParametersUndefined: Self = StObject.set(x, "ConformancePackInputParameters", js.undefined)
    
    inline def setConformancePackInputParametersVarargs(value: ConformancePackInputParameter*): Self = StObject.set(x, "ConformancePackInputParameters", js.Array(value*))
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3Bucket(value: DeliveryS3Bucket): Self = StObject.set(x, "DeliveryS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3BucketUndefined: Self = StObject.set(x, "DeliveryS3Bucket", js.undefined)
    
    inline def setDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = StObject.set(x, "DeliveryS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setDeliveryS3KeyPrefixUndefined: Self = StObject.set(x, "DeliveryS3KeyPrefix", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateS3Uri(value: TemplateS3Uri): Self = StObject.set(x, "TemplateS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTemplateS3UriUndefined: Self = StObject.set(x, "TemplateS3Uri", js.undefined)
    
    inline def setTemplateSSMDocumentDetails(value: TemplateSSMDocumentDetails): Self = StObject.set(x, "TemplateSSMDocumentDetails", value.asInstanceOf[js.Any])
    
    inline def setTemplateSSMDocumentDetailsUndefined: Self = StObject.set(x, "TemplateSSMDocumentDetails", js.undefined)
  }
}
