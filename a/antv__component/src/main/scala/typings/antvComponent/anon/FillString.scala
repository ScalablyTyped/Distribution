package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillString extends StObject {
  
  var fill: String = js.native
}
object FillString {
  
  @scala.inline
  def apply(fill: String): FillString = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillString]
  }
  
  @scala.inline
  implicit class FillStringMutableBuilder[Self <: FillString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
  }
}
