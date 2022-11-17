package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgTemplateOutlet extends StObject {
  
  var ngTemplateOutlet: "ngTemplateOutlet"
  
  var ngTemplateOutletContext: "ngTemplateOutletContext"
  
  var ngTemplateOutletInjector: "ngTemplateOutletInjector"
}
object NgTemplateOutlet {
  
  inline def apply(): NgTemplateOutlet = {
    val __obj = js.Dynamic.literal(ngTemplateOutlet = "ngTemplateOutlet", ngTemplateOutletContext = "ngTemplateOutletContext", ngTemplateOutletInjector = "ngTemplateOutletInjector")
    __obj.asInstanceOf[NgTemplateOutlet]
  }
  
  extension [Self <: NgTemplateOutlet](x: Self) {
    
    inline def setNgTemplateOutlet(value: "ngTemplateOutlet"): Self = StObject.set(x, "ngTemplateOutlet", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateOutletContext(value: "ngTemplateOutletContext"): Self = StObject.set(x, "ngTemplateOutletContext", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateOutletInjector(value: "ngTemplateOutletInjector"): Self = StObject.set(x, "ngTemplateOutletInjector", value.asInstanceOf[js.Any])
  }
}
