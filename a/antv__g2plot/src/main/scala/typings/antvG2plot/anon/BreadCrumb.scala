package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadCrumb extends StObject {
  
  var breadCrumb: DividerText
  
  var enabled: Boolean
}
object BreadCrumb {
  
  inline def apply(breadCrumb: DividerText, enabled: Boolean): BreadCrumb = {
    val __obj = js.Dynamic.literal(breadCrumb = breadCrumb.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadCrumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreadCrumb] (val x: Self) extends AnyVal {
    
    inline def setBreadCrumb(value: DividerText): Self = StObject.set(x, "breadCrumb", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
