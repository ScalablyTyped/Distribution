package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resizable extends StObject {
  
  val Resizable: Boolean
}
object Resizable {
  
  inline def apply(Resizable: Boolean): Resizable = {
    val __obj = js.Dynamic.literal(Resizable = Resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resizable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resizable] (val x: Self) extends AnyVal {
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "Resizable", value.asInstanceOf[js.Any])
  }
}
