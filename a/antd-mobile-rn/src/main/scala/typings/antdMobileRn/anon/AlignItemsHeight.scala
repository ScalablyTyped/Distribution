package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItemsHeight extends StObject {
  
  var alignItems: String = js.native
  
  var height: Double = js.native
  
  var justifyContent: String = js.native
}
object AlignItemsHeight {
  
  @scala.inline
  def apply(alignItems: String, height: Double, justifyContent: String): AlignItemsHeight = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsHeight]
  }
  
  @scala.inline
  implicit class AlignItemsHeightMutableBuilder[Self <: AlignItemsHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
