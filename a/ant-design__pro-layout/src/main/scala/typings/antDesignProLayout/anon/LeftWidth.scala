package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftWidth extends StObject {
  
  var leftWidth: js.UndefOr[String] = js.undefined
}
object LeftWidth {
  
  @scala.inline
  def apply(): LeftWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftWidth]
  }
  
  @scala.inline
  implicit class LeftWidthMutableBuilder[Self <: LeftWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
  }
}
