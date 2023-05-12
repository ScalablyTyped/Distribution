package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeErrorLocation extends StObject {
  
  /**
    * The column number in the code. Defaults to 0 if unknown.
    */
  var column: js.UndefOr[CodeErrorColumn] = js.undefined
  
  /**
    * The line number in the code. Defaults to 0 if unknown.
    */
  var line: js.UndefOr[CodeErrorLine] = js.undefined
  
  /**
    * The span/length of the error. Defaults to -1 if unknown.
    */
  var span: js.UndefOr[CodeErrorSpan] = js.undefined
}
object CodeErrorLocation {
  
  inline def apply(): CodeErrorLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeErrorLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeErrorLocation] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: CodeErrorColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: CodeErrorLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setSpan(value: CodeErrorSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
