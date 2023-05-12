package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTimeValue extends StObject {
  
  /**
    * Contains an integer that specifies the time period in minutes.  Valid value: 15
    */
  var Minutes: js.UndefOr[typings.awsSdk.clientsS3controlMod.Minutes] = js.undefined
}
object ReplicationTimeValue {
  
  inline def apply(): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTimeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationTimeValue] (val x: Self) extends AnyVal {
    
    inline def setMinutes(value: Minutes): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "Minutes", js.undefined)
  }
}
