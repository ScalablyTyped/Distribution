package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassAttr extends StObject {
  
  var classAttr: js.UndefOr[String] = js.undefined
  
  var styleAttr: js.UndefOr[String] = js.undefined
}
object ClassAttr {
  
  @scala.inline
  def apply(): ClassAttr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttr]
  }
  
  @scala.inline
  implicit class ClassAttrMutableBuilder[Self <: ClassAttr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassAttr(value: String): Self = StObject.set(x, "classAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassAttrUndefined: Self = StObject.set(x, "classAttr", js.undefined)
    
    @scala.inline
    def setStyleAttr(value: String): Self = StObject.set(x, "styleAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleAttrUndefined: Self = StObject.set(x, "styleAttr", js.undefined)
  }
}
