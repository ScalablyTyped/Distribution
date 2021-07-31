package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  val Top: Double
}
object Top {
  
  @scala.inline
  def apply(Top: Double): Top = {
    val __obj = js.Dynamic.literal(Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
