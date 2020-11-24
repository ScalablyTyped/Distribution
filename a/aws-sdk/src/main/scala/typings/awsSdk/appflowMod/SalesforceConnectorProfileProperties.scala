package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceConnectorProfileProperties extends js.Object {
  
  /**
    *  The location of the Salesforce resource. 
    */
  var instanceUrl: js.UndefOr[InstanceUrl] = js.native
  
  /**
    *  Indicates whether the connector profile applies to a sandbox or production environment. 
    */
  var isSandboxEnvironment: js.UndefOr[Boolean] = js.native
}
object SalesforceConnectorProfileProperties {
  
  @scala.inline
  def apply(): SalesforceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class SalesforceConnectorProfilePropertiesOps[Self <: SalesforceConnectorProfileProperties] (val x: Self) extends AnyVal {
    
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
    def setInstanceUrl(value: InstanceUrl): Self = this.set("instanceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceUrl: Self = this.set("instanceUrl", js.undefined)
    
    @scala.inline
    def setIsSandboxEnvironment(value: Boolean): Self = this.set("isSandboxEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSandboxEnvironment: Self = this.set("isSandboxEnvironment", js.undefined)
  }
}
