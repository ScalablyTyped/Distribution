package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftRetryOptions extends StObject {
  
  /**
    * The length of time during which Kinesis Data Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Kinesis Data Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.undefined
}
object RedshiftRetryOptions {
  
  inline def apply(): RedshiftRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftRetryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftRetryOptions] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: RedshiftRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
