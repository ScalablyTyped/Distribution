package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyFilter extends StObject {
  
  /**
    * Filter on Active or Expired API keys.
    */
  var KeyStatus: js.UndefOr[Status] = js.undefined
}
object ApiKeyFilter {
  
  inline def apply(): ApiKeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiKeyFilter] (val x: Self) extends AnyVal {
    
    inline def setKeyStatus(value: Status): Self = StObject.set(x, "KeyStatus", value.asInstanceOf[js.Any])
    
    inline def setKeyStatusUndefined: Self = StObject.set(x, "KeyStatus", js.undefined)
  }
}
