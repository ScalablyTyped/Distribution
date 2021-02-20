package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetY extends StObject {
  
  var offsetY: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[text] = js.native
}
object OffsetY {
  
  @scala.inline
  def apply(): OffsetY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetY]
  }
  
  @scala.inline
  implicit class OffsetYMutableBuilder[Self <: OffsetY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
