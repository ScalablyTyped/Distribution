package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  var hide: Double
  
  var show: Double
}
object Hide {
  
  @scala.inline
  def apply(hide: Double, show: Double): Hide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit class HideMutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
