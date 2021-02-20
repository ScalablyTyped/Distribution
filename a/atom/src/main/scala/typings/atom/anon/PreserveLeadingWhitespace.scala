package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveLeadingWhitespace extends StObject {
  
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.native
}
object PreserveLeadingWhitespace {
  
  @scala.inline
  def apply(): PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveLeadingWhitespace]
  }
  
  @scala.inline
  implicit class PreserveLeadingWhitespaceMutableBuilder[Self <: PreserveLeadingWhitespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveLeadingWhitespace(value: Boolean): Self = StObject.set(x, "preserveLeadingWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveLeadingWhitespaceUndefined: Self = StObject.set(x, "preserveLeadingWhitespace", js.undefined)
  }
}
