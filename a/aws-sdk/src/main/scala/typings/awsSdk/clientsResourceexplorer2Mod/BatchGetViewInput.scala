package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetViewInput extends StObject {
  
  /**
    * A list of Amazon resource names (ARNs) that identify the views you want details for.
    */
  var ViewArns: js.UndefOr[BatchGetViewInputViewArnsList] = js.undefined
}
object BatchGetViewInput {
  
  inline def apply(): BatchGetViewInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetViewInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetViewInput] (val x: Self) extends AnyVal {
    
    inline def setViewArns(value: BatchGetViewInputViewArnsList): Self = StObject.set(x, "ViewArns", value.asInstanceOf[js.Any])
    
    inline def setViewArnsUndefined: Self = StObject.set(x, "ViewArns", js.undefined)
    
    inline def setViewArnsVarargs(value: String*): Self = StObject.set(x, "ViewArns", js.Array(value*))
  }
}
