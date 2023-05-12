package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var attributes: Mode
  
  var displayName: String
  
  var id: String
  
  var overrideTheme: String
  
  var palette: String
}
object DisplayName {
  
  inline def apply(attributes: Mode, displayName: String, id: String, overrideTheme: String, palette: String): DisplayName = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideTheme = overrideTheme.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Mode): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideTheme(value: String): Self = StObject.set(x, "overrideTheme", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
  }
}
