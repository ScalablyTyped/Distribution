package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonOpenSearchServerlessRetryOptions extends StObject {
  
  /**
    * After an initial failure to deliver to the Serverless offering for Amazon OpenSearch Service, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
    */
  var DurationInSeconds: js.UndefOr[AmazonOpenSearchServerlessRetryDurationInSeconds] = js.undefined
}
object AmazonOpenSearchServerlessRetryOptions {
  
  inline def apply(): AmazonOpenSearchServerlessRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonOpenSearchServerlessRetryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonOpenSearchServerlessRetryOptions] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: AmazonOpenSearchServerlessRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
