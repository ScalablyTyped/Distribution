package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeData extends StObject {
  
  /**
    * The name of the theme.
    */
  var name: ThemeName
  
  /**
    * Describes the properties that can be overriden to customize an instance of the theme.
    */
  var overrides: js.UndefOr[ThemeValuesList] = js.undefined
  
  /**
    * One or more key-value pairs to use when tagging the theme data.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A list of key-value pairs that deﬁnes the properties of the theme.
    */
  var values: ThemeValuesList
}
object CreateThemeData {
  
  inline def apply(name: ThemeName, values: ThemeValuesList): CreateThemeData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThemeData]
  }
  
  extension [Self <: CreateThemeData](x: Self) {
    
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
