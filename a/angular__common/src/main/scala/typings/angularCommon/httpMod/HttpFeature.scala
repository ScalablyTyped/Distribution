package typings.angularCommon.httpMod

import typings.angularCore.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpFeature[KindT /* <: HttpFeatureKind */] extends StObject {
  
  var ɵkind: KindT
  
  var ɵproviders: js.Array[Provider]
}
object HttpFeature {
  
  inline def apply[KindT /* <: HttpFeatureKind */](ɵkind: KindT, ɵproviders: js.Array[Provider]): HttpFeature[KindT] = {
    val __obj = js.Dynamic.literal(ɵkind = ɵkind.asInstanceOf[js.Any], ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpFeature[KindT]]
  }
  
  extension [Self <: HttpFeature[?], KindT /* <: HttpFeatureKind */](x: Self & HttpFeature[KindT]) {
    
    inline def setƟkind(value: KindT): Self = StObject.set(x, "\u0275kind", value.asInstanceOf[js.Any])
    
    inline def setƟproviders(value: js.Array[Provider]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: Provider*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
