package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedSelection extends StObject {
  
  var end: Point = js.native
  
  var isBackwards: Boolean = js.native
  
  var start: Point = js.native
}
object SavedSelection {
  
  @scala.inline
  def apply(end: Point, isBackwards: Boolean, start: Point): SavedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isBackwards = isBackwards.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedSelection]
  }
  
  @scala.inline
  implicit class SavedSelectionMutableBuilder[Self <: SavedSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackwards(value: Boolean): Self = StObject.set(x, "isBackwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
