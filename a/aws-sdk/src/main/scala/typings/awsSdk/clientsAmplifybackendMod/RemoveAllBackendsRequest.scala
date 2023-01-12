package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAllBackendsRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * Cleans up the Amplify Console app if this value is set to true.
    */
  var CleanAmplifyApp: js.UndefOr[boolean] = js.undefined
}
object RemoveAllBackendsRequest {
  
  inline def apply(AppId: string): RemoveAllBackendsRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAllBackendsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAllBackendsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setCleanAmplifyApp(value: boolean): Self = StObject.set(x, "CleanAmplifyApp", value.asInstanceOf[js.Any])
    
    inline def setCleanAmplifyAppUndefined: Self = StObject.set(x, "CleanAmplifyApp", js.undefined)
  }
}
