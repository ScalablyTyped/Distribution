package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteRequest extends StObject {
  
  var id: SiteGenericIdentifier
}
object GetSiteRequest {
  
  inline def apply(id: SiteGenericIdentifier): GetSiteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSiteRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: SiteGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
