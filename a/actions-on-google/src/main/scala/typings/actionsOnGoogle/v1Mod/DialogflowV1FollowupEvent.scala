package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1FollowupEvent extends StObject {
  
  var data: js.UndefOr[DialogflowV1Parameters] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object DialogflowV1FollowupEvent {
  
  @scala.inline
  def apply(): DialogflowV1FollowupEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1FollowupEvent]
  }
  
  @scala.inline
  implicit class DialogflowV1FollowupEventMutableBuilder[Self <: DialogflowV1FollowupEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DialogflowV1Parameters): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
