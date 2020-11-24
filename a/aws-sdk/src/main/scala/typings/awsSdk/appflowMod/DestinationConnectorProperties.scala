package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationConnectorProperties extends js.Object {
  
  /**
    *  The properties required to query Amazon EventBridge. 
    */
  var EventBridge: js.UndefOr[EventBridgeDestinationProperties] = js.native
  
  /**
    *  The properties required to query Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftDestinationProperties] = js.native
  
  /**
    *  The properties required to query Amazon S3. 
    */
  var S3: js.UndefOr[S3DestinationProperties] = js.native
  
  /**
    *  The properties required to query Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceDestinationProperties] = js.native
  
  /**
    *  The properties required to query Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeDestinationProperties] = js.native
}
object DestinationConnectorProperties {
  
  @scala.inline
  def apply(): DestinationConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConnectorProperties]
  }
  
  @scala.inline
  implicit class DestinationConnectorPropertiesOps[Self <: DestinationConnectorProperties] (val x: Self) extends AnyVal {
    
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
    def setEventBridge(value: EventBridgeDestinationProperties): Self = this.set("EventBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBridge: Self = this.set("EventBridge", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftDestinationProperties): Self = this.set("Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("Redshift", js.undefined)
    
    @scala.inline
    def setS3(value: S3DestinationProperties): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceDestinationProperties): Self = this.set("Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforce: Self = this.set("Salesforce", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeDestinationProperties): Self = this.set("Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowflake: Self = this.set("Snowflake", js.undefined)
  }
}
