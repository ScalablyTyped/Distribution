package typings.antd.anon

import typings.antd.confirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  def destroy(args: js.Any*): Unit
  
  def update(configUpdate: ConfigUpdate): Unit
}
object Update {
  
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Unit, update: ConfigUpdate => Unit): Update = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: ConfigUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
