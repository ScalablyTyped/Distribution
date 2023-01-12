package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeNewline extends StObject {
  
  var includeNewline: js.UndefOr[Boolean] = js.undefined
}
object IncludeNewline {
  
  inline def apply(): IncludeNewline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNewline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeNewline] (val x: Self) extends AnyVal {
    
    inline def setIncludeNewline(value: Boolean): Self = StObject.set(x, "includeNewline", value.asInstanceOf[js.Any])
    
    inline def setIncludeNewlineUndefined: Self = StObject.set(x, "includeNewline", js.undefined)
  }
}
