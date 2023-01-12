package typings.awsSdk.clientsAugmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopInput extends StObject {
  
  /**
    * Serialized input from the human loop. The input must be a string representation of a file in JSON format.
    */
  var InputContent: typings.awsSdk.clientsAugmentedairuntimeMod.InputContent
}
object HumanLoopInput {
  
  inline def apply(InputContent: InputContent): HumanLoopInput = {
    val __obj = js.Dynamic.literal(InputContent = InputContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HumanLoopInput] (val x: Self) extends AnyVal {
    
    inline def setInputContent(value: InputContent): Self = StObject.set(x, "InputContent", value.asInstanceOf[js.Any])
  }
}
