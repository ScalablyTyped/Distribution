package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialSlideWidth extends StObject {
  
  var initialSlideWidth: Double = js.native
}
object InitialSlideWidth {
  
  @scala.inline
  def apply(initialSlideWidth: Double): InitialSlideWidth = {
    val __obj = js.Dynamic.literal(initialSlideWidth = initialSlideWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialSlideWidth]
  }
  
  @scala.inline
  implicit class InitialSlideWidthMutableBuilder[Self <: InitialSlideWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
  }
}
