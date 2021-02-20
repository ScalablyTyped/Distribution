package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoComplete extends StObject {
  
  var autoComplete: js.UndefOr[String] = js.native
}
object AutoComplete {
  
  @scala.inline
  def apply(): AutoComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoComplete]
  }
  
  @scala.inline
  implicit class AutoCompleteMutableBuilder[Self <: AutoComplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
  }
}
