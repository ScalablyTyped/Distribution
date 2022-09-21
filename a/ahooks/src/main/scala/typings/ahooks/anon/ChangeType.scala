package typings.ahooks.anon

import typings.ahooks.ahooksStrings.advance
import typings.ahooks.ahooksStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeType extends StObject {
  
  def changeType(): Unit
  
  def reset(): Unit
  
  def submit(): Unit
  
  var `type`: simple | advance
}
object ChangeType {
  
  inline def apply(changeType: () => Unit, reset: () => Unit, submit: () => Unit, `type`: simple | advance): ChangeType = {
    val __obj = js.Dynamic.literal(changeType = js.Any.fromFunction0(changeType), reset = js.Any.fromFunction0(reset), submit = js.Any.fromFunction0(submit))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeType]
  }
  
  extension [Self <: ChangeType](x: Self) {
    
    inline def setChangeType(value: () => Unit): Self = StObject.set(x, "changeType", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    inline def setType(value: simple | advance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
