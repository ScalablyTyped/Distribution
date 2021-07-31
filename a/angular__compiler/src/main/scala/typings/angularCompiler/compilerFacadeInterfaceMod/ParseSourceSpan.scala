package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseSourceSpan extends StObject {
  
  var details: js.Any
  
  var end: js.Any
  
  var fullStart: js.Any
  
  var start: js.Any
}
object ParseSourceSpan {
  
  @scala.inline
  def apply(details: js.Any, end: js.Any, fullStart: js.Any, start: js.Any): ParseSourceSpan = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], fullStart = fullStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseSourceSpan]
  }
  
  @scala.inline
  implicit class ParseSourceSpanMutableBuilder[Self <: ParseSourceSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullStart(value: js.Any): Self = StObject.set(x, "fullStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
