package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenSummary extends StObject {
  
  /**
    * The date and time when the personal access token will expire, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var expiresTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The system-generated ID of the personal access token.
    */
  var id: AccessTokenId
  
  /**
    * The friendly name of the personal access token.
    */
  var name: AccessTokenName
}
object AccessTokenSummary {
  
  inline def apply(id: AccessTokenId, name: AccessTokenName): AccessTokenSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessTokenSummary] (val x: Self) extends AnyVal {
    
    inline def setExpiresTime(value: js.Date): Self = StObject.set(x, "expiresTime", value.asInstanceOf[js.Any])
    
    inline def setExpiresTimeUndefined: Self = StObject.set(x, "expiresTime", js.undefined)
    
    inline def setId(value: AccessTokenId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessTokenName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
