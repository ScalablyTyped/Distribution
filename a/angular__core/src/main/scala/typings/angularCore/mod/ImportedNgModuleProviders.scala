package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedNgModuleProviders extends StObject {
  
  var ɵproviders: js.Array[Provider]
}
object ImportedNgModuleProviders {
  
  inline def apply(ɵproviders: js.Array[Provider]): ImportedNgModuleProviders = {
    val __obj = js.Dynamic.literal(ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportedNgModuleProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportedNgModuleProviders] (val x: Self) extends AnyVal {
    
    inline def setƟproviders(value: js.Array[Provider]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: Provider*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
