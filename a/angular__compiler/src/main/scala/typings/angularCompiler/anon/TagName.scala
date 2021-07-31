package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.JSDocTag
import typings.angularCompiler.outputAstMod.JSDocTagName
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
  
  @scala.inline
  def apply(tagName: JSDocTagName | String): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
  
  @scala.inline
  implicit class TagNameMutableBuilder[Self <: TagName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagName(value: JSDocTagName | String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
