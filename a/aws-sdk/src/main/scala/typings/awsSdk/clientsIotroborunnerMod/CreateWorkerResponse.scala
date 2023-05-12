package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerResponse extends StObject {
  
  var arn: WorkerArn
  
  var createdAt: js.Date
  
  var id: WorkerId
  
  var site: SiteArn
  
  var updatedAt: js.Date
}
object CreateWorkerResponse {
  
  inline def apply(arn: WorkerArn, createdAt: js.Date, id: WorkerId, site: SiteArn, updatedAt: js.Date): CreateWorkerResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkerResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WorkerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSite(value: SiteArn): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
