package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watch extends StObject {
  
  var priority: js.UndefOr[Double] = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
}
object Watch {
  
  @scala.inline
  def apply(): Watch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Watch]
  }
  
  @scala.inline
  implicit class WatchMutableBuilder[Self <: Watch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
