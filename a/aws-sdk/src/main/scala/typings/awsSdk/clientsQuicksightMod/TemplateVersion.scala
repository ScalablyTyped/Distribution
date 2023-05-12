package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersion extends StObject {
  
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Schema of the dataset identified by the placeholder. Any dashboard created from this template should be bound to new datasets matching the same schema described through this API operation.
    */
  var DataSetConfigurations: js.UndefOr[DataSetConfigurationList] = js.undefined
  
  /**
    * The description of the template.
    */
  var Description: js.UndefOr[VersionDescription] = js.undefined
  
  /**
    * Errors associated with this template version.
    */
  var Errors: js.UndefOr[TemplateErrorList] = js.undefined
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an analysis or template that was used to create this template.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status that is associated with the template.    CREATION_IN_PROGRESS     CREATION_SUCCESSFUL     CREATION_FAILED     UPDATE_IN_PROGRESS     UPDATE_SUCCESSFUL     UPDATE_FAILED     DELETED   
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The ARN of the theme associated with this version of the template.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The version number of the template version.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionNumber] = js.undefined
}
object TemplateVersion {
  
  inline def apply(): TemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateVersion] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDataSetConfigurations(value: DataSetConfigurationList): Self = StObject.set(x, "DataSetConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDataSetConfigurationsUndefined: Self = StObject.set(x, "DataSetConfigurations", js.undefined)
    
    inline def setDataSetConfigurationsVarargs(value: DataSetConfiguration*): Self = StObject.set(x, "DataSetConfigurations", js.Array(value*))
    
    inline def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrors(value: TemplateErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: TemplateError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setSheets(value: SheetList): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    inline def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "Sheets", js.Array(value*))
    
    inline def setSourceEntityArn(value: Arn): Self = StObject.set(x, "SourceEntityArn", value.asInstanceOf[js.Any])
    
    inline def setSourceEntityArnUndefined: Self = StObject.set(x, "SourceEntityArn", js.undefined)
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
