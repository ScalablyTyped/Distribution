package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationNote extends StObject {
  
  /**
    * The note for an item (section or question) in a contact evaluation.
    */
  var Value: js.UndefOr[EvaluationNoteString] = js.undefined
}
object EvaluationNote {
  
  inline def apply(): EvaluationNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationNote] (val x: Self) extends AnyVal {
    
    inline def setValue(value: EvaluationNoteString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
