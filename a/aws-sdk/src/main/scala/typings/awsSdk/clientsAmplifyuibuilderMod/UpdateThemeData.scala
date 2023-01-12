package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeData extends StObject {
  
  /**
    * The unique ID of the theme to update.
    */
  var id: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The name of the theme to update.
    */
  var name: js.UndefOr[ThemeName] = js.undefined
  
  /**
    * Describes the properties that can be overriden to customize the theme.
    */
  var overrides: js.UndefOr[ThemeValuesList] = js.undefined
  
  /**
    * A list of key-value pairs that define the theme's properties.
    */
  var values: ThemeValuesList
}
object UpdateThemeData {
  
  inline def apply(values: ThemeValuesList): UpdateThemeData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThemeData] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverrides(value: ThemeValuesList): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ThemeValues*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setValues(value: ThemeValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ThemeValues*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
