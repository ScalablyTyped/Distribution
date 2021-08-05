package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConnectorProperties extends StObject {
  
  /**
    *  The properties required to query Amazon EventBridge. 
    */
  var EventBridge: js.UndefOr[EventBridgeDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Amazon S3. 
    */
  var S3: js.UndefOr[S3DestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceDestinationProperties] = js.undefined
  
  /**
    *  The properties required to query Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeDestinationProperties] = js.undefined
}
object DestinationConnectorProperties {
  
  inline def apply(): DestinationConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConnectorProperties]
  }
  
  extension [Self <: DestinationConnectorProperties](x: Self) {
    
    inline def setEventBridge(value: EventBridgeDestinationProperties): Self = StObject.set(x, "EventBridge", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeUndefined: Self = StObject.set(x, "EventBridge", js.undefined)
    
    inline def setRedshift(value: RedshiftDestinationProperties): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    inline def setS3(value: S3DestinationProperties): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSalesforce(value: SalesforceDestinationProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setSnowflake(value: SnowflakeDestinationProperties): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    inline def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
  }
}
