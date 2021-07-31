package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  def cancel(): Unit
}
object Cancel {
  
  @scala.inline
  def apply(cancel: () => Unit): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
