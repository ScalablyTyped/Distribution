package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.ngComponentOutlet
import typings.angularCommon.angularCommonStrings.ngComponentOutletContent
import typings.angularCommon.angularCommonStrings.ngComponentOutletInjector
import typings.angularCommon.angularCommonStrings.ngComponentOutletNgModule
import typings.angularCommon.angularCommonStrings.ngComponentOutletNgModuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgComponentOutlet extends StObject {
  
  var ngComponentOutlet: typings.angularCommon.angularCommonStrings.ngComponentOutlet
  
  var ngComponentOutletContent: typings.angularCommon.angularCommonStrings.ngComponentOutletContent
  
  var ngComponentOutletInjector: typings.angularCommon.angularCommonStrings.ngComponentOutletInjector
  
  var ngComponentOutletNgModule: typings.angularCommon.angularCommonStrings.ngComponentOutletNgModule
  
  var ngComponentOutletNgModuleFactory: typings.angularCommon.angularCommonStrings.ngComponentOutletNgModuleFactory
}
object NgComponentOutlet {
  
  inline def apply(): NgComponentOutlet = {
    val __obj = js.Dynamic.literal(ngComponentOutlet = "ngComponentOutlet", ngComponentOutletContent = "ngComponentOutletContent", ngComponentOutletInjector = "ngComponentOutletInjector", ngComponentOutletNgModule = "ngComponentOutletNgModule", ngComponentOutletNgModuleFactory = "ngComponentOutletNgModuleFactory")
    __obj.asInstanceOf[NgComponentOutlet]
  }
  
  extension [Self <: NgComponentOutlet](x: Self) {
    
    inline def setNgComponentOutlet(value: ngComponentOutlet): Self = StObject.set(x, "ngComponentOutlet", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletContent(value: ngComponentOutletContent): Self = StObject.set(x, "ngComponentOutletContent", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletInjector(value: ngComponentOutletInjector): Self = StObject.set(x, "ngComponentOutletInjector", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModule(value: ngComponentOutletNgModule): Self = StObject.set(x, "ngComponentOutletNgModule", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModuleFactory(value: ngComponentOutletNgModuleFactory): Self = StObject.set(x, "ngComponentOutletNgModuleFactory", value.asInstanceOf[js.Any])
  }
}
