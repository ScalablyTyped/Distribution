package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstRange extends StObject {
  
  var firstRange: Range
  
  var range: js.UndefOr[Range] = js.undefined
}
object FirstRange {
  
  inline def apply(firstRange: Range): FirstRange = {
    val __obj = js.Dynamic.literal(firstRange = firstRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstRange] (val x: Self) extends AnyVal {
    
    inline def setFirstRange(value: Range): Self = StObject.set(x, "firstRange", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
