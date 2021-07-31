package typings.antd.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyContent extends StObject {
  
  var bodyContent: js.UndefOr[js.Object | ReactElement | Null] = js.undefined
  
  var customize: Boolean
}
object BodyContent {
  
  @scala.inline
  def apply(customize: Boolean): BodyContent = {
    val __obj = js.Dynamic.literal(customize = customize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContent]
  }
  
  @scala.inline
  implicit class BodyContentMutableBuilder[Self <: BodyContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyContent(value: js.Object | ReactElement): Self = StObject.set(x, "bodyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyContentNull: Self = StObject.set(x, "bodyContent", null)
    
    @scala.inline
    def setBodyContentUndefined: Self = StObject.set(x, "bodyContent", js.undefined)
    
    @scala.inline
    def setCustomize(value: Boolean): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
  }
}
