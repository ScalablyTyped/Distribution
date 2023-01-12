package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFeedback extends StObject {
  
  /**
    * Optional Positive or Negative feedback submitted by the user about whether the recommendation is useful or not.
    */
  var `type`: FeedbackType
}
object UserFeedback {
  
  inline def apply(`type`: FeedbackType): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
    inline def setType(value: FeedbackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
