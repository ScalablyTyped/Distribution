package typings.activexLibreoffice.com_.sun.star.bridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** string/value pair */
@js.native
trait ProtocolProperty extends StObject {
  
  var Name: String = js.native
  
  var Value: js.Any = js.native
}
object ProtocolProperty {
  
  @scala.inline
  def apply(Name: String, Value: js.Any): ProtocolProperty = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolProperty]
  }
  
  @scala.inline
  implicit class ProtocolPropertyMutableBuilder[Self <: ProtocolProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
