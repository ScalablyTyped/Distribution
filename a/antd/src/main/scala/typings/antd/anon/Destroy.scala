package typings.antd.anon

import typings.antd.confirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  def destroy(): Unit
  
  def update(configUpdate: ConfigUpdate): Unit
}
object Destroy {
  
  inline def apply(destroy: () => Unit, update: ConfigUpdate => Unit): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Destroy]
  }
  
  extension [Self <: Destroy](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: ConfigUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
