package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustX extends StObject {
  
  var adjustX: js.UndefOr[Boolean] = js.native
  
  var adjustY: js.UndefOr[Boolean] = js.native
}
object AdjustX {
  
  @scala.inline
  def apply(): AdjustX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustX]
  }
  
  @scala.inline
  implicit class AdjustXMutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustX(value: Boolean): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
    
    @scala.inline
    def setAdjustY(value: Boolean): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
  }
}
