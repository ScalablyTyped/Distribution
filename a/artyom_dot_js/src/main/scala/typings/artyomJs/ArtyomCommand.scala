package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtyomCommand extends StObject {
  
  var action: js.Function = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var indexes: js.Array[_] = js.native
  
  var smart: js.UndefOr[Boolean] = js.native
}
object ArtyomCommand {
  
  @scala.inline
  def apply(action: js.Function, indexes: js.Array[_]): ArtyomCommand = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomCommand]
  }
  
  @scala.inline
  implicit class ArtyomCommandMutableBuilder[Self <: ArtyomCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIndexes(value: js.Array[_]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: js.Any*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}
