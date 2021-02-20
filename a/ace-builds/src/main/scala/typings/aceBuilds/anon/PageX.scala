package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageX extends StObject {
  
  var pageX: Double = js.native
  
  var pageY: Double = js.native
}
object PageX {
  
  @scala.inline
  def apply(pageX: Double, pageY: Double): PageX = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageX]
  }
  
  @scala.inline
  implicit class PageXMutableBuilder[Self <: PageX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
  }
}
