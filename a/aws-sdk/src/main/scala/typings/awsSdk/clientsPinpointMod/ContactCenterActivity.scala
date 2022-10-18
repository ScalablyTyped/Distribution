package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactCenterActivity extends StObject {
  
  /**
    * The unique identifier for the next activity to perform after the this activity.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
}
object ContactCenterActivity {
  
  inline def apply(): ContactCenterActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactCenterActivity]
  }
  
  extension [Self <: ContactCenterActivity](x: Self) {
    
    inline def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    inline def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
  }
}
