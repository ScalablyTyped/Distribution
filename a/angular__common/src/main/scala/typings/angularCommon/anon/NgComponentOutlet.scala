package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgComponentOutlet extends StObject {
  
  var ngComponentOutlet: AliasRequired
  
  var ngComponentOutletContent: `7`
  
  var ngComponentOutletInjector: `6`
  
  var ngComponentOutletNgModule: `8`
  
  var ngComponentOutletNgModuleFactory: `9`
}
object NgComponentOutlet {
  
  inline def apply(
    ngComponentOutlet: AliasRequired,
    ngComponentOutletContent: `7`,
    ngComponentOutletInjector: `6`,
    ngComponentOutletNgModule: `8`,
    ngComponentOutletNgModuleFactory: `9`
  ): NgComponentOutlet = {
    val __obj = js.Dynamic.literal(ngComponentOutlet = ngComponentOutlet.asInstanceOf[js.Any], ngComponentOutletContent = ngComponentOutletContent.asInstanceOf[js.Any], ngComponentOutletInjector = ngComponentOutletInjector.asInstanceOf[js.Any], ngComponentOutletNgModule = ngComponentOutletNgModule.asInstanceOf[js.Any], ngComponentOutletNgModuleFactory = ngComponentOutletNgModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgComponentOutlet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgComponentOutlet] (val x: Self) extends AnyVal {
    
    inline def setNgComponentOutlet(value: AliasRequired): Self = StObject.set(x, "ngComponentOutlet", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletContent(value: `7`): Self = StObject.set(x, "ngComponentOutletContent", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletInjector(value: `6`): Self = StObject.set(x, "ngComponentOutletInjector", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModule(value: `8`): Self = StObject.set(x, "ngComponentOutletNgModule", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModuleFactory(value: `9`): Self = StObject.set(x, "ngComponentOutletNgModuleFactory", value.asInstanceOf[js.Any])
  }
}
