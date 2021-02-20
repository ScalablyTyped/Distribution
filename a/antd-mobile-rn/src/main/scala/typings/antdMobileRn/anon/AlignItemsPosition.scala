package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItemsPosition extends StObject {
  
  var alignItems: String = js.native
  
  var position: String = js.native
}
object AlignItemsPosition {
  
  @scala.inline
  def apply(alignItems: String, position: String): AlignItemsPosition = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsPosition]
  }
  
  @scala.inline
  implicit class AlignItemsPositionMutableBuilder[Self <: AlignItemsPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
