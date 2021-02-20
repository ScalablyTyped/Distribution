package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorFlex extends StObject {
  
  var backgroundColor: String = js.native
  
  var flex: Double = js.native
}
object BackgroundColorFlex {
  
  @scala.inline
  def apply(backgroundColor: String, flex: Double): BackgroundColorFlex = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorFlex]
  }
  
  @scala.inline
  implicit class BackgroundColorFlexMutableBuilder[Self <: BackgroundColorFlex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
  }
}
