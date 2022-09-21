package typings.angularRouter.mod

import typings.angularCore.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterFeature[FeatureKind /* <: RouterFeatureKind */] extends StObject {
  
  var ɵkind: FeatureKind
  
  var ɵproviders: js.Array[Provider]
}
object RouterFeature {
  
  inline def apply[FeatureKind /* <: RouterFeatureKind */](ɵkind: FeatureKind, ɵproviders: js.Array[Provider]): RouterFeature[FeatureKind] = {
    val __obj = js.Dynamic.literal(ɵkind = ɵkind.asInstanceOf[js.Any], ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterFeature[FeatureKind]]
  }
  
  extension [Self <: RouterFeature[?], FeatureKind /* <: RouterFeatureKind */](x: Self & RouterFeature[FeatureKind]) {
    
    inline def setƟkind(value: FeatureKind): Self = StObject.set(x, "\u0275kind", value.asInstanceOf[js.Any])
    
    inline def setƟproviders(value: js.Array[Provider]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: Provider*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
