package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operators extends StObject {
  
  def convert(from: String): js.Any = js.native
  
  var operators: Add = js.native
  
  var rtrim: js.Any = js.native
  
  /* private */ def trim(value: js.Any): js.Any = js.native
}
object Operators {
  
  @scala.inline
  def apply(convert: String => js.Any, operators: Add, rtrim: js.Any, trim: js.Any => js.Any): Operators = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), operators = operators.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[Operators]
  }
  
  @scala.inline
  implicit class OperatorsMutableBuilder[Self <: Operators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: String => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOperators(value: Add): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtrim(value: js.Any): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrim(value: js.Any => js.Any): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
  }
}
