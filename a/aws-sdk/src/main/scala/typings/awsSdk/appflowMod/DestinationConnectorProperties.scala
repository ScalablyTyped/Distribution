package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationConnectorProperties extends StObject {
  
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
  implicit class DestinationConnectorPropertiesMutableBuilder[Self <: DestinationConnectorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBridge(value: EventBridgeDestinationProperties): Self = StObject.set(x, "EventBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBridgeUndefined: Self = StObject.set(x, "EventBridge", js.undefined)
    
    @scala.inline
    def setRedshift(value: RedshiftDestinationProperties): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    @scala.inline
    def setS3(value: S3DestinationProperties): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceDestinationProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    @scala.inline
    def setSnowflake(value: SnowflakeDestinationProperties): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
  }
}
