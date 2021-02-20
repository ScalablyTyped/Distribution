package typings.activexLibreoffice.com_.sun.star.animations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeFilterPair extends StObject {
  
  var Progress: Double = js.native
  
  var Time: Double = js.native
}
object TimeFilterPair {
  
  @scala.inline
  def apply(Progress: Double, Time: Double): TimeFilterPair = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFilterPair]
  }
  
  @scala.inline
  implicit class TimeFilterPairMutableBuilder[Self <: TimeFilterPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
