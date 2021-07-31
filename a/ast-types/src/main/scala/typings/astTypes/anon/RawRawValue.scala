package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawRawValue extends StObject {
  
  var raw: String
  
  var rawValue: Double
}
object RawRawValue {
  
  @scala.inline
  def apply(raw: String, rawValue: Double): RawRawValue = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRawValue]
  }
  
  @scala.inline
  implicit class RawRawValueMutableBuilder[Self <: RawRawValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
