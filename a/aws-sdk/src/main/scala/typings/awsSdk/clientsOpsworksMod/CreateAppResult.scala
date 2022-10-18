package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResult extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
}
object CreateAppResult {
  
  inline def apply(): CreateAppResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResult]
  }
  
  extension [Self <: CreateAppResult](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
  }
}
