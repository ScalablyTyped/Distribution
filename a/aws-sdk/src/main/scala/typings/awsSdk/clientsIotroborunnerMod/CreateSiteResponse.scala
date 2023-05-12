package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteResponse extends StObject {
  
  var arn: SiteArn
  
  var createdAt: js.Date
  
  var id: SiteId
  
  var updatedAt: js.Date
}
object CreateSiteResponse {
  
  inline def apply(arn: SiteArn, createdAt: js.Date, id: SiteId, updatedAt: js.Date): CreateSiteResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SiteArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: SiteId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
