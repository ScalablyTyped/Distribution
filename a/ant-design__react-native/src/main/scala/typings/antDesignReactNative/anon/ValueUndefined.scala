package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueUndefined extends StObject {
  
  var value: Unit
}
object ValueUndefined {
  
  @scala.inline
  def apply(value: Unit): ValueUndefined = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUndefined]
  }
  
  @scala.inline
  implicit class ValueUndefinedMutableBuilder[Self <: ValueUndefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
