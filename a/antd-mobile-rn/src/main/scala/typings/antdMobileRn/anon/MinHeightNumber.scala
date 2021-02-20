package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinHeightNumber extends StObject {
  
  var minHeight: Double = js.native
}
object MinHeightNumber {
  
  @scala.inline
  def apply(minHeight: Double): MinHeightNumber = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightNumber]
  }
  
  @scala.inline
  implicit class MinHeightNumberMutableBuilder[Self <: MinHeightNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
  }
}
