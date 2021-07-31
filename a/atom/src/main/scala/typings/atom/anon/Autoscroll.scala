package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autoscroll extends StObject {
  
  var autoscroll: js.UndefOr[Boolean] = js.undefined
}
object Autoscroll {
  
  @scala.inline
  def apply(): Autoscroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoscroll]
  }
  
  @scala.inline
  implicit class AutoscrollMutableBuilder[Self <: Autoscroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollUndefined: Self = StObject.set(x, "autoscroll", js.undefined)
  }
}
