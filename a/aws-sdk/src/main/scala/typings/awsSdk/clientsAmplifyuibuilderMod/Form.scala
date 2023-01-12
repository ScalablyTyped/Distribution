package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  /**
    * The unique ID of the Amplify app associated with the form.
    */
  var appId: String
  
  /**
    * Stores the call to action configuration for the form.
    */
  var cta: js.UndefOr[FormCTA] = js.undefined
  
  /**
    * The type of data source to use to create the form.
    */
  var dataType: FormDataTypeConfig
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * Stores the information about the form's fields.
    */
  var fields: FieldsMap
  
  /**
    * The operation to perform on the specified form.
    */
  var formActionType: FormActionType
  
  /**
    * The unique ID of the form.
    */
  var id: Uuid
  
  /**
    * The name of the form.
    */
  var name: FormName
  
  /**
    * The schema version of the form when it was imported.
    */
  var schemaVersion: String
  
  /**
    * Stores the visual helper elements for the form that are not associated with any data.
    */
  var sectionalElements: SectionalElementMap
  
  /**
    * Stores the configuration for the form's style.
    */
  var style: FormStyle
  
  /**
    * One or more key-value pairs to use when tagging the form.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object Form {
  
  inline def apply(
    appId: String,
    dataType: FormDataTypeConfig,
    environmentName: String,
    fields: FieldsMap,
    formActionType: FormActionType,
    id: Uuid,
    name: FormName,
    schemaVersion: String,
    sectionalElements: SectionalElementMap,
    style: FormStyle
  ): Form = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formActionType = formActionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any], sectionalElements = sectionalElements.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setCta(value: FormCTA): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    inline def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    inline def setDataType(value: FormDataTypeConfig): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setFields(value: FieldsMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFormActionType(value: FormActionType): Self = StObject.set(x, "formActionType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: FormName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSectionalElements(value: SectionalElementMap): Self = StObject.set(x, "sectionalElements", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FormStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
