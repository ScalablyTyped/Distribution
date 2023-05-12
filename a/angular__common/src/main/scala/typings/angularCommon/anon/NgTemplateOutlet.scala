package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgTemplateOutlet extends StObject {
  
  var ngTemplateOutlet: `17`
  
  var ngTemplateOutletContext: `16`
  
  var ngTemplateOutletInjector: `18`
}
object NgTemplateOutlet {
  
  inline def apply(ngTemplateOutlet: `17`, ngTemplateOutletContext: `16`, ngTemplateOutletInjector: `18`): NgTemplateOutlet = {
    val __obj = js.Dynamic.literal(ngTemplateOutlet = ngTemplateOutlet.asInstanceOf[js.Any], ngTemplateOutletContext = ngTemplateOutletContext.asInstanceOf[js.Any], ngTemplateOutletInjector = ngTemplateOutletInjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgTemplateOutlet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgTemplateOutlet] (val x: Self) extends AnyVal {
    
    inline def setNgTemplateOutlet(value: `17`): Self = StObject.set(x, "ngTemplateOutlet", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateOutletContext(value: `16`): Self = StObject.set(x, "ngTemplateOutletContext", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateOutletInjector(value: `18`): Self = StObject.set(x, "ngTemplateOutletInjector", value.asInstanceOf[js.Any])
  }
}
