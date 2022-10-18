package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateVersion extends StObject {
  
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined
  
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.clientsEc2Mod.VersionDescription] = js.undefined
  
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}
object LaunchTemplateVersion {
  
  inline def apply(): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
  
  extension [Self <: LaunchTemplateVersion](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    inline def setLaunchTemplateData(value: ResponseLaunchTemplateData): Self = StObject.set(x, "LaunchTemplateData", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateDataUndefined: Self = StObject.set(x, "LaunchTemplateData", js.undefined)
    
    inline def setLaunchTemplateId(value: String): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    inline def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
    
    inline def setVersionNumber(value: Long): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
