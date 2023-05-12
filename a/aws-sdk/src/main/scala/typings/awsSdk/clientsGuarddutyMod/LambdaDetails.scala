package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaDetails extends StObject {
  
  /**
    * Description of the Lambda function.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the Lambda function.
    */
  var FunctionArn: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the Lambda function.
    */
  var FunctionName: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the Lambda function.
    */
  var FunctionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the Lambda function was last modified. This field is in the UTC date string format (2023-03-22T19:37:20.168Z).
    */
  var LastModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The revision ID of the Lambda function version.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The execution role of the Lambda function.
    */
  var Role: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tags attached to this resource, listed in the format of key:value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Tags] = js.undefined
  
  /**
    * Amazon Virtual Private Cloud configuration details associated with your Lambda function.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.VpcConfig] = js.undefined
}
object LambdaDetails {
  
  inline def apply(): LambdaDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFunctionArn(value: String): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setFunctionVersion(value: String): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    inline def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "LastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAtUndefined: Self = StObject.set(x, "LastModifiedAt", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
