package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameStyle extends StObject {
  
  var nameStyle: OpacityNumber = js.native
}
object NameStyle {
  
  @scala.inline
  def apply(nameStyle: OpacityNumber): NameStyle = {
    val __obj = js.Dynamic.literal(nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStyle]
  }
  
  @scala.inline
  implicit class NameStyleMutableBuilder[Self <: NameStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameStyle(value: OpacityNumber): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
  }
}
