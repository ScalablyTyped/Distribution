package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  var instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RCNotificationInstance */ Any
  
  var prefixCls: String
}
object Instance {
  
  inline def apply(
    instance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RCNotificationInstance */ Any,
    prefixCls: String
  ): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setInstance(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RCNotificationInstance */ Any
    ): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
