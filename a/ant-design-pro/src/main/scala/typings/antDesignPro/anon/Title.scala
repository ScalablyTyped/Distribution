package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var href: js.UndefOr[String] = js.undefined
  
  var title: String | Double
}
object Title {
  
  @scala.inline
  def apply(title: String | Double): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
