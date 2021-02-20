package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelModeratedByAppInstanceUserSummary extends StObject {
  
  var ChannelSummary: js.UndefOr[typings.awsSdk.chimeMod.ChannelSummary] = js.native
}
object ChannelModeratedByAppInstanceUserSummary {
  
  @scala.inline
  def apply(): ChannelModeratedByAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratedByAppInstanceUserSummary]
  }
  
  @scala.inline
  implicit class ChannelModeratedByAppInstanceUserSummaryMutableBuilder[Self <: ChannelModeratedByAppInstanceUserSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelSummary(value: ChannelSummary): Self = StObject.set(x, "ChannelSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelSummaryUndefined: Self = StObject.set(x, "ChannelSummary", js.undefined)
  }
}
