package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorsTextOptions extends StObject {
  
  var dataVar: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object ErrorsTextOptions {
  
  @scala.inline
  def apply(): ErrorsTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorsTextOptions]
  }
  
  @scala.inline
  implicit class ErrorsTextOptionsMutableBuilder[Self <: ErrorsTextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataVar(value: String): Self = StObject.set(x, "dataVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarUndefined: Self = StObject.set(x, "dataVar", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
