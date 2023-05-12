package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonopensearchserviceRetryOptions extends StObject {
  
  /**
    * After an initial failure to deliver to Amazon OpenSearch Service, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries. 
    */
  var DurationInSeconds: js.UndefOr[AmazonopensearchserviceRetryDurationInSeconds] = js.undefined
}
object AmazonopensearchserviceRetryOptions {
  
  inline def apply(): AmazonopensearchserviceRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonopensearchserviceRetryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonopensearchserviceRetryOptions] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: AmazonopensearchserviceRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
