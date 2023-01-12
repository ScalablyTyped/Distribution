package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timing extends StObject {
  
  /**
    * The time the job finished transcoding, in epoch milliseconds.
    */
  var FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The time the job began transcoding, in epoch milliseconds.
    */
  var StartTimeMillis: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
    */
  var SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined
}
object Timing {
  
  inline def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
    
    inline def setFinishTimeMillis(value: NullableLong): Self = StObject.set(x, "FinishTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeMillisUndefined: Self = StObject.set(x, "FinishTimeMillis", js.undefined)
    
    inline def setStartTimeMillis(value: NullableLong): Self = StObject.set(x, "StartTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "StartTimeMillis", js.undefined)
    
    inline def setSubmitTimeMillis(value: NullableLong): Self = StObject.set(x, "SubmitTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeMillisUndefined: Self = StObject.set(x, "SubmitTimeMillis", js.undefined)
  }
}
