package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountSettingsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListAccountSettings request. When the results of a ListAccountSettings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The account settings for the resource.
    */
  var settings: js.UndefOr[Settings] = js.undefined
}
object ListAccountSettingsResponse {
  
  inline def apply(): ListAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
