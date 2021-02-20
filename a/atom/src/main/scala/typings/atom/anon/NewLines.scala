package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewLines extends StObject {
  
  var newLines: Double = js.native
  
  var newStart: Double = js.native
  
  var oldLines: Double = js.native
  
  var oldStart: Double = js.native
}
object NewLines {
  
  @scala.inline
  def apply(newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): NewLines = {
    val __obj = js.Dynamic.literal(newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewLines]
  }
  
  @scala.inline
  implicit class NewLinesMutableBuilder[Self <: NewLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewLines(value: Double): Self = StObject.set(x, "newLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStart(value: Double): Self = StObject.set(x, "newStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLines(value: Double): Self = StObject.set(x, "oldLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldStart(value: Double): Self = StObject.set(x, "oldStart", value.asInstanceOf[js.Any])
  }
}
