package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSiteRequest extends StObject {
  
  var id: SiteGenericIdentifier
}
object DeleteSiteRequest {
  
  inline def apply(id: SiteGenericIdentifier): DeleteSiteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSiteRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: SiteGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
