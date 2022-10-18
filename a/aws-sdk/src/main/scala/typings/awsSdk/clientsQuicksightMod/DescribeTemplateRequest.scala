package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplateRequest extends StObject {
  
  /**
    * The alias of the template that you want to describe. If you name a specific alias, you describe the version that the alias points to. You can specify the latest version of the template by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to templates.
    */
  var AliasName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AliasName] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that contains the template that you're describing.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId
  
  /**
    * (Optional) The number for the version to describe. If a VersionNumber parameter value isn't provided, the latest version of the template is described.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionNumber] = js.undefined
}
object DescribeTemplateRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DescribeTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplateRequest]
  }
  
  extension [Self <: DescribeTemplateRequest](x: Self) {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
