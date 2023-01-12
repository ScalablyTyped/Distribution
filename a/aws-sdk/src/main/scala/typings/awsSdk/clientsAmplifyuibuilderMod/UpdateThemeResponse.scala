package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeResponse extends StObject {
  
  /**
    * Describes the configuration of the updated theme.
    */
  var entity: js.UndefOr[Theme] = js.undefined
}
object UpdateThemeResponse {
  
  inline def apply(): UpdateThemeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThemeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThemeResponse] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: Theme): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
