package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceUserMembershipSummary extends StObject {
  
  /**
    * The time at which a summary was last read.
    */
  var ReadMarkerTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The type of channel summary, 
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.native
}
object AppInstanceUserMembershipSummary {
  
  @scala.inline
  def apply(): AppInstanceUserMembershipSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserMembershipSummary]
  }
  
  @scala.inline
  implicit class AppInstanceUserMembershipSummaryMutableBuilder[Self <: AppInstanceUserMembershipSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadMarkerTimestamp(value: Timestamp): Self = StObject.set(x, "ReadMarkerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMarkerTimestampUndefined: Self = StObject.set(x, "ReadMarkerTimestamp", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
