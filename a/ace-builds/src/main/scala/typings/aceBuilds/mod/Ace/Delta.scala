package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.insert
import typings.aceBuilds.aceBuildsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends StObject {
  
  var action: insert | remove = js.native
  
  var end: Point = js.native
  
  var lines: js.Array[String] = js.native
  
  var start: Point = js.native
}
object Delta {
  
  @scala.inline
  def apply(action: insert | remove, end: Point, lines: js.Array[String], start: Point): Delta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
