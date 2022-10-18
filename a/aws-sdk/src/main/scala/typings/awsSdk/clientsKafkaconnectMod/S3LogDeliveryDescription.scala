package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogDeliveryDescription extends StObject {
  
  /**
    * The name of the S3 bucket that is the destination for log delivery.
    */
  var bucket: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether connector logs get sent to the specified Amazon S3 destination.
    */
  var enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * The S3 prefix that is the destination for log delivery.
    */
  var prefix: js.UndefOr[string] = js.undefined
}
object S3LogDeliveryDescription {
  
  inline def apply(): S3LogDeliveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3LogDeliveryDescription]
  }
  
  extension [Self <: S3LogDeliveryDescription](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPrefix(value: string): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
