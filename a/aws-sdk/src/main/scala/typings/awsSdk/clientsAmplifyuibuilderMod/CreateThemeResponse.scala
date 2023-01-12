package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeResponse extends StObject {
  
  /**
    * Describes the configuration of the new theme.
    */
  var entity: js.UndefOr[Theme] = js.undefined
}
object CreateThemeResponse {
  
  inline def apply(): CreateThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThemeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThemeResponse] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: Theme): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
