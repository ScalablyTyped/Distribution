package typings.antd.anon

import typings.antd.confirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destroy extends StObject {
  
  def destroy(): Unit = js.native
  
  def update(configUpdate: ConfigUpdate): Unit = js.native
}
object Destroy {
  
  @scala.inline
  def apply(destroy: () => Unit, update: ConfigUpdate => Unit): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Destroy]
  }
  
  @scala.inline
  implicit class DestroyMutableBuilder[Self <: Destroy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: ConfigUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
