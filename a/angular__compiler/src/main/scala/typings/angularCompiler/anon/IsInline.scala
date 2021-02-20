package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInline extends StObject {
  
  var isInline: Boolean = js.native
  
  var templateUrl: String | Null = js.native
}
object IsInline {
  
  @scala.inline
  def apply(isInline: Boolean): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  
  @scala.inline
  implicit class IsInlineMutableBuilder[Self <: IsInline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlNull: Self = StObject.set(x, "templateUrl", null)
  }
}
