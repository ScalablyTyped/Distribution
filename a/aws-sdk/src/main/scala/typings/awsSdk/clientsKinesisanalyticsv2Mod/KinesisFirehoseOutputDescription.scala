package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseOutputDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
  
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.RoleARN] = js.undefined
}
object KinesisFirehoseOutputDescription {
  
  inline def apply(ResourceARN: ResourceARN): KinesisFirehoseOutputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseOutputDescription]
  }
  
  extension [Self <: KinesisFirehoseOutputDescription](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
