package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseSpecification extends StObject {
  
  /**
    * Indicates whether the user can interrupt a speech response from Amazon Lex.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A collection of responses that Amazon Lex can send to the user. Amazon Lex chooses the actual response to send at runtime.
    */
  var messageGroups: MessageGroupsList
}
object ResponseSpecification {
  
  inline def apply(messageGroups: MessageGroupsList): ResponseSpecification = {
    val __obj = js.Dynamic.literal(messageGroups = messageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSpecification] (val x: Self) extends AnyVal {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setMessageGroups(value: MessageGroupsList): Self = StObject.set(x, "messageGroups", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupsVarargs(value: MessageGroup*): Self = StObject.set(x, "messageGroups", js.Array(value*))
  }
}
