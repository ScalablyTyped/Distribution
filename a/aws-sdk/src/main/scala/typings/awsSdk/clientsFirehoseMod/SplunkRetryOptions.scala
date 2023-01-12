package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplunkRetryOptions extends StObject {
  
  /**
    * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for acknowledgment from Splunk after each attempt.
    */
  var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined
}
object SplunkRetryOptions {
  
  inline def apply(): SplunkRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplunkRetryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplunkRetryOptions] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: SplunkRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
