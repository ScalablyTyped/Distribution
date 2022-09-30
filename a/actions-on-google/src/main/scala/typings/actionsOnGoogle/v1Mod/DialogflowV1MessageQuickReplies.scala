package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageQuickReplies
  extends StObject
     with DialogflowV1BaseMessage[`2`]
     with DialogflowV1Message {
  
  var replies: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageQuickReplies {
  
  inline def apply(): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
  
  extension [Self <: DialogflowV1MessageQuickReplies](x: Self) {
    
    inline def setReplies(value: js.Array[String]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: String*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
