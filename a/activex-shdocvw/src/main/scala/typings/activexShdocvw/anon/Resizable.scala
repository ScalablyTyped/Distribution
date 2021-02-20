package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resizable extends StObject {
  
  val Resizable: Boolean = js.native
}
object Resizable {
  
  @scala.inline
  def apply(Resizable: Boolean): Resizable = {
    val __obj = js.Dynamic.literal(Resizable = Resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resizable]
  }
  
  @scala.inline
  implicit class ResizableMutableBuilder[Self <: Resizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "Resizable", value.asInstanceOf[js.Any])
  }
}
