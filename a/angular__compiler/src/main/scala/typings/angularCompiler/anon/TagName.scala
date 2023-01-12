package typings.angularCompiler.anon

import typings.angularCompiler.mod.JSDocTag
import typings.angularCompiler.mod.JSDocTagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagName
  extends StObject
     with JSDocTag {
  
  var tagName: JSDocTagName | String
  
  var text: js.UndefOr[String] = js.undefined
}
object TagName {
  
  inline def apply(tagName: JSDocTagName | String): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagName] (val x: Self) extends AnyVal {
    
    inline def setTagName(value: JSDocTagName | String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
