package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeNewline extends StObject {
  
  var includeNewline: js.UndefOr[Boolean] = js.undefined
}
object IncludeNewline {
  
  @scala.inline
  def apply(): IncludeNewline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNewline]
  }
  
  @scala.inline
  implicit class IncludeNewlineMutableBuilder[Self <: IncludeNewline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeNewline(value: Boolean): Self = StObject.set(x, "includeNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNewlineUndefined: Self = StObject.set(x, "includeNewline", js.undefined)
  }
}
