package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visible extends StObject {
  
  val Visible: Boolean = js.native
}
object Visible {
  
  @scala.inline
  def apply(Visible: Boolean): Visible = {
    val __obj = js.Dynamic.literal(Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  
  @scala.inline
  implicit class VisibleMutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
