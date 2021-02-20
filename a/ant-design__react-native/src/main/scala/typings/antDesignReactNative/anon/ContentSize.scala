package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSize extends StObject {
  
  var contentSize: Height = js.native
}
object ContentSize {
  
  @scala.inline
  def apply(contentSize: Height): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
  
  @scala.inline
  implicit class ContentSizeMutableBuilder[Self <: ContentSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
  }
}
