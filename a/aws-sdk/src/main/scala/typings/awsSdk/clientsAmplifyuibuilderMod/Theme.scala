package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  /**
    * The unique ID for the Amplify app associated with the theme.
    */
  var appId: String
  
  /**
    * The time that the theme was created.
    */
  var createdAt: js.Date
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The ID for the theme.
    */
  var id: Uuid
  
  /**
    * The time that the theme was modified.
    */
  var modifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the theme.
    */
  var name: ThemeName
  
  /**
    * Describes the properties that can be overriden to customize a theme.
    */
  var overrides: js.UndefOr[ThemeValuesList] = js.undefined
  
  /**
    * One or more key-value pairs to use when tagging the theme.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A list of key-value pairs that defines the properties of the theme.
    */
  var values: ThemeValuesList
}
object Theme {
  
  inline def apply(
    appId: String,
    createdAt: js.Date,
    environmentName: String,
    id: Uuid,
    name: ThemeName,
    values: ThemeValuesList
  ): Theme = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: ThemeValuesList): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ThemeValues*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setValues(value: ThemeValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ThemeValues*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
