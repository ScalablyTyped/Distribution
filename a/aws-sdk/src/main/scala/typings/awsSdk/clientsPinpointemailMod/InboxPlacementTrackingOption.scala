package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboxPlacementTrackingOption extends StObject {
  
  /**
    * Specifies whether inbox placement data is being tracked for the domain.
    */
  var Global: js.UndefOr[Enabled] = js.undefined
  
  /**
    * An array of strings, one for each major email provider that the inbox placement data applies to.
    */
  var TrackedIsps: js.UndefOr[IspNameList] = js.undefined
}
object InboxPlacementTrackingOption {
  
  inline def apply(): InboxPlacementTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InboxPlacementTrackingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboxPlacementTrackingOption] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: Enabled): Self = StObject.set(x, "Global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "Global", js.undefined)
    
    inline def setTrackedIsps(value: IspNameList): Self = StObject.set(x, "TrackedIsps", value.asInstanceOf[js.Any])
    
    inline def setTrackedIspsUndefined: Self = StObject.set(x, "TrackedIsps", js.undefined)
    
    inline def setTrackedIspsVarargs(value: IspName*): Self = StObject.set(x, "TrackedIsps", js.Array(value*))
  }
}
