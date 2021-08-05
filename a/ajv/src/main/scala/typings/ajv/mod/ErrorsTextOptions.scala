package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorsTextOptions extends StObject {
  
  var dataVar: js.UndefOr[String] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
}
object ErrorsTextOptions {
  
  inline def apply(): ErrorsTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorsTextOptions]
  }
  
  extension [Self <: ErrorsTextOptions](x: Self) {
    
    inline def setDataVar(value: String): Self = StObject.set(x, "dataVar", value.asInstanceOf[js.Any])
    
    inline def setDataVarUndefined: Self = StObject.set(x, "dataVar", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
