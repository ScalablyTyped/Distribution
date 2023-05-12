package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHubContentResponse extends StObject {
  
  /**
    * The ARN of the hub that the content was imported into.
    */
  var HubArn: typings.awsSdk.clientsSagemakerMod.HubArn
  
  /**
    * The ARN of the hub content that was imported.
    */
  var HubContentArn: typings.awsSdk.clientsSagemakerMod.HubContentArn
}
object ImportHubContentResponse {
  
  inline def apply(HubArn: HubArn, HubContentArn: HubContentArn): ImportHubContentResponse = {
    val __obj = js.Dynamic.literal(HubArn = HubArn.asInstanceOf[js.Any], HubContentArn = HubContentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHubContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHubContentResponse] (val x: Self) extends AnyVal {
    
    inline def setHubArn(value: HubArn): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
    
    inline def setHubContentArn(value: HubContentArn): Self = StObject.set(x, "HubContentArn", value.asInstanceOf[js.Any])
  }
}
