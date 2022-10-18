package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningTemplateVersionRequest extends StObject {
  
  /**
    * The template name.
    */
  var templateName: TemplateName
  
  /**
    * The provisioning template version ID.
    */
  var versionId: TemplateVersionId
}
object DescribeProvisioningTemplateVersionRequest {
  
  inline def apply(templateName: TemplateName, versionId: TemplateVersionId): DescribeProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionRequest]
  }
  
  extension [Self <: DescribeProvisioningTemplateVersionRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: TemplateVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
