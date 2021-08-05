package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operators extends StObject {
  
  def convert(from: String): js.Any
  
  var operators: Add
  
  /* private */ var rtrim: js.Any
  
  /* private */ def trim(value: js.Any): js.Any
}
object Operators {
  
  inline def apply(convert: String => js.Any, operators: Add, rtrim: js.Any, trim: js.Any => js.Any): Operators = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), operators = operators.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[Operators]
  }
  
  extension [Self <: Operators](x: Self) {
    
    inline def setConvert(value: String => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    inline def setOperators(value: Add): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setRtrim(value: js.Any): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: js.Any => js.Any): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
  }
}
