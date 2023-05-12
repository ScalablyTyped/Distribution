package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetMeasurementsLogDelivery extends StObject {
  
  /**
    * The configuration information for publishing Internet Monitor internet measurements to Amazon S3. The configuration includes the bucket name and (optionally) prefix for the S3 bucket to store the measurements, and the delivery status. The delivery status is ENABLED or DISABLED, depending on whether you choose to deliver internet measurements to S3 logs.
    */
  var S3Config: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.S3Config] = js.undefined
}
object InternetMeasurementsLogDelivery {
  
  inline def apply(): InternetMeasurementsLogDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetMeasurementsLogDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternetMeasurementsLogDelivery] (val x: Self) extends AnyVal {
    
    inline def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigUndefined: Self = StObject.set(x, "S3Config", js.undefined)
  }
}
