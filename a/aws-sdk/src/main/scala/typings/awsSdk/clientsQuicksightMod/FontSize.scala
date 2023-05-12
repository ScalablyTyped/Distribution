package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  /**
    * The lexical name for the text size, proportional to its surrounding context.
    */
  var Relative: js.UndefOr[RelativeFontSize] = js.undefined
}
object FontSize {
  
  inline def apply(): FontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
    
    inline def setRelative(value: RelativeFontSize): Self = StObject.set(x, "Relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "Relative", js.undefined)
  }
}
