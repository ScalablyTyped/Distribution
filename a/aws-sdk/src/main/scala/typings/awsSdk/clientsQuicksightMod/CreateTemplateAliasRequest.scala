package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateAliasRequest extends StObject {
  
  /**
    * The name that you want to give to the template alias that you're creating. Don't start the alias name with the $ character. Alias names that start with $ are reserved by Amazon QuickSight. 
    */
  var AliasName: typings.awsSdk.clientsQuicksightMod.AliasName
  
  /**
    * The ID of the Amazon Web Services account that contains the template that you creating an alias for.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * An ID for the template.
    */
  var TemplateId: RestrictiveResourceId
  
  /**
    * The version number of the template.
    */
  var TemplateVersionNumber: VersionNumber
}
object CreateTemplateAliasRequest {
  
  inline def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    TemplateVersionNumber: VersionNumber
  ): CreateTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateVersionNumber = TemplateVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateAliasRequest]
  }
  
  extension [Self <: CreateTemplateAliasRequest](x: Self) {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionNumber(value: VersionNumber): Self = StObject.set(x, "TemplateVersionNumber", value.asInstanceOf[js.Any])
  }
}
