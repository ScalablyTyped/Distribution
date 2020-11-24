package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectorEntitiesRequest extends js.Object {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account, and is used to query the downstream connector. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.native
  
  /**
    *  This optional parameter is specific to connector implementation. Some connectors support multiple levels or categories of entities. You can find out the list of roots for such providers by sending a request without the entitiesPath parameter. If the connector supports entities at different roots, this initial request returns the list of roots. Otherwise, this request returns all entities supported by the provider. 
    */
  var entitiesPath: js.UndefOr[EntitiesPath] = js.native
}
object ListConnectorEntitiesRequest {
  
  @scala.inline
  def apply(): ListConnectorEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorEntitiesRequest]
  }
  
  @scala.inline
  implicit class ListConnectorEntitiesRequestOps[Self <: ListConnectorEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileName: Self = this.set("connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
    
    @scala.inline
    def setEntitiesPath(value: EntitiesPath): Self = this.set("entitiesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitiesPath: Self = this.set("entitiesPath", js.undefined)
  }
}
