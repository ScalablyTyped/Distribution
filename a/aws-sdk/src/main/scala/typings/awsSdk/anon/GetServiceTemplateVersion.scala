package typings.awsSdk.anon

import typings.awsSdk.clientsProtonMod.ResourceName
import typings.awsSdk.clientsProtonMod.TemplateVersionPart
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/proton.GetServiceTemplateVersionInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetServiceTemplateVersion extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * To get service template major version detail data, include major Version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * To get service template minor version detail data, include minorVersion.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The name of the service template a version of which you want to get detailed data for.
    */
  var templateName: ResourceName
}
object GetServiceTemplateVersion {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): GetServiceTemplateVersion = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceTemplateVersion]
  }
  
  extension [Self <: GetServiceTemplateVersion](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
