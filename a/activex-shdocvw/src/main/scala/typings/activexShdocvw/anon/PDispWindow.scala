package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDispWindow extends StObject {
  
  val pDispWindow: js.Any
}
object PDispWindow {
  
  @scala.inline
  def apply(pDispWindow: js.Any): PDispWindow = {
    val __obj = js.Dynamic.literal(pDispWindow = pDispWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDispWindow]
  }
  
  @scala.inline
  implicit class PDispWindowMutableBuilder[Self <: PDispWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDispWindow(value: js.Any): Self = StObject.set(x, "pDispWindow", value.asInstanceOf[js.Any])
  }
}
