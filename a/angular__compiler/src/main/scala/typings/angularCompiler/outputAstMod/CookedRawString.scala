package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookedRawString extends StObject {
  
  var cooked: String = js.native
  
  var range: ParseSourceSpan | Null = js.native
  
  var raw: String = js.native
}
object CookedRawString {
  
  @scala.inline
  def apply(cooked: String, raw: String): CookedRawString = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookedRawString]
  }
  
  @scala.inline
  implicit class CookedRawStringMutableBuilder[Self <: CookedRawString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ParseSourceSpan): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = StObject.set(x, "range", null)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
