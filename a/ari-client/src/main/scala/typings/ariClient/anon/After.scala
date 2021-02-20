package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After extends StObject {
  
  var after: js.UndefOr[Double] = js.native
  
  var before: js.UndefOr[Double] = js.native
  
  var between: js.UndefOr[Double] = js.native
  
  var channelId: String = js.native
  
  var dtmf: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object After {
  
  @scala.inline
  def apply(channelId: String): After = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBetween(value: Double): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtmf(value: String): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
