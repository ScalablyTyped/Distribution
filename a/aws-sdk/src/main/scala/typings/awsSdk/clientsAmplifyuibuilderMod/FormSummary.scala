package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSummary extends StObject {
  
  /**
    * The unique ID for the app associated with the form summary.
    */
  var appId: String
  
  /**
    * The form's data source type.
    */
  var dataType: FormDataTypeConfig
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The type of operation to perform on the form.
    */
  var formActionType: FormActionType
  
  /**
    * The ID of the form.
    */
  var id: Uuid
  
  /**
    * The name of the form.
    */
  var name: FormName
}
object FormSummary {
  
  inline def apply(
    appId: String,
    dataType: FormDataTypeConfig,
    environmentName: String,
    formActionType: FormActionType,
    id: Uuid,
    name: FormName
  ): FormSummary = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], formActionType = formActionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSummary]
  }
  
  extension [Self <: FormSummary](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: FormDataTypeConfig): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setFormActionType(value: FormActionType): Self = StObject.set(x, "formActionType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: FormName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
