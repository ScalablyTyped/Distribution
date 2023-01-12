package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateName extends StObject {
  
  val propName: String
  
  val templateName: String
}
object TemplateName {
  
  inline def apply(propName: String, templateName: String): TemplateName = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateName] (val x: Self) extends AnyVal {
    
    inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
