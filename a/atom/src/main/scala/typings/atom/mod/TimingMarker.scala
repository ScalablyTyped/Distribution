package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimingMarker extends StObject {
  
  var label: String = js.native
  
  var time: Double = js.native
}
object TimingMarker {
  
  @scala.inline
  def apply(label: String, time: Double): TimingMarker = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingMarker]
  }
  
  @scala.inline
  implicit class TimingMarkerMutableBuilder[Self <: TimingMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
