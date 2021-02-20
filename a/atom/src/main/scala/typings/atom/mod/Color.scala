package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): String = js.native
  
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): String = js.native
}
object Color {
  
  @scala.inline
  def apply(toHexString: () => String, toRGBAString: () => String): Color = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toRGBAString = js.Any.fromFunction0(toRGBAString))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToRGBAString(value: () => String): Self = StObject.set(x, "toRGBAString", js.Any.fromFunction0(value))
  }
}
