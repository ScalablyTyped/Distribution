package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedJobTemplateRequest extends StObject {
  
  /**
    * The unique name of a managed job template, which is required.
    */
  var templateName: ManagedJobTemplateName
  
  /**
    * An optional parameter to specify version of a managed template. If not specified, the pre-defined default version is returned.
    */
  var templateVersion: js.UndefOr[ManagedTemplateVersion] = js.undefined
}
object DescribeManagedJobTemplateRequest {
  
  inline def apply(templateName: ManagedJobTemplateName): DescribeManagedJobTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeManagedJobTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeManagedJobTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: ManagedJobTemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersion(value: ManagedTemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
