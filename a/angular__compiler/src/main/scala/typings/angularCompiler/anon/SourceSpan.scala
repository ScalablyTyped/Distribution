package typings.angularCompiler.anon

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSpan extends StObject {
  
  var sourceSpan: ParseSourceSpan | Null
}
object SourceSpan {
  
  @scala.inline
  def apply(): SourceSpan = {
    val __obj = js.Dynamic.literal(sourceSpan = null)
    __obj.asInstanceOf[SourceSpan]
  }
  
  @scala.inline
  implicit class SourceSpanMutableBuilder[Self <: SourceSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSpanNull: Self = StObject.set(x, "sourceSpan", null)
  }
}
