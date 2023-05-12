package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDefinition extends StObject {
  
  /**
    * The name of the notebook to search for.
    */
  var Name: js.UndefOr[NotebookName] = js.undefined
}
object FilterDefinition {
  
  inline def apply(): FilterDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDefinition] (val x: Self) extends AnyVal {
    
    inline def setName(value: NotebookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
