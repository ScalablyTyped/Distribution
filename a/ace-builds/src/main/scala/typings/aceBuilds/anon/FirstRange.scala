package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstRange extends StObject {
  
  var firstRange: Range = js.native
  
  var range: js.UndefOr[Range] = js.native
}
object FirstRange {
  
  @scala.inline
  def apply(firstRange: Range): FirstRange = {
    val __obj = js.Dynamic.literal(firstRange = firstRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstRange]
  }
  
  @scala.inline
  implicit class FirstRangeMutableBuilder[Self <: FirstRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstRange(value: Range): Self = StObject.set(x, "firstRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
