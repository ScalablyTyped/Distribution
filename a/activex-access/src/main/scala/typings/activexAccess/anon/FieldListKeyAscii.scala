package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldListKeyAscii extends StObject {
  
  val FieldList: Double
  
  var KeyAscii: Double
}
object FieldListKeyAscii {
  
  @scala.inline
  def apply(FieldList: Double, KeyAscii: Double): FieldListKeyAscii = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListKeyAscii]
  }
  
  @scala.inline
  implicit class FieldListKeyAsciiMutableBuilder[Self <: FieldListKeyAscii] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAscii(value: Double): Self = StObject.set(x, "KeyAscii", value.asInstanceOf[js.Any])
  }
}
