package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  val Left: Double
}
object Left {
  
  @scala.inline
  def apply(Left: Double): Left = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
  }
}
