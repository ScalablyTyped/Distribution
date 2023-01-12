package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  val Visible: Boolean
}
object Visible {
  
  inline def apply(Visible: Boolean): Visible = {
    val __obj = js.Dynamic.literal(Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
