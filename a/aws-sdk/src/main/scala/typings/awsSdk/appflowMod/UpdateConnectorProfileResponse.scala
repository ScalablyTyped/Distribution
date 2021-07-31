package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorProfileResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
}
object UpdateConnectorProfileResponse {
  
  @scala.inline
  def apply(): UpdateConnectorProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectorProfileResponse]
  }
  
  @scala.inline
  implicit class UpdateConnectorProfileResponseMutableBuilder[Self <: UpdateConnectorProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileArn(value: ConnectorProfileArn): Self = StObject.set(x, "connectorProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileArnUndefined: Self = StObject.set(x, "connectorProfileArn", js.undefined)
  }
}
