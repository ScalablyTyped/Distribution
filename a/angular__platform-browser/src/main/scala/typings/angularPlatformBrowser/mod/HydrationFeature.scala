package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrationFeature[FeatureKind /* <: HydrationFeatureKind */] extends StObject {
  
  var ɵkind: FeatureKind
  
  var ɵproviders: js.Array[Provider]
}
object HydrationFeature {
  
  inline def apply[FeatureKind /* <: HydrationFeatureKind */](ɵkind: FeatureKind, ɵproviders: js.Array[Provider]): HydrationFeature[FeatureKind] = {
    val __obj = js.Dynamic.literal(ɵkind = ɵkind.asInstanceOf[js.Any], ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrationFeature[FeatureKind]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HydrationFeature[?], FeatureKind /* <: HydrationFeatureKind */] (val x: Self & HydrationFeature[FeatureKind]) extends AnyVal {
    
    inline def setƟkind(value: FeatureKind): Self = StObject.set(x, "\u0275kind", value.asInstanceOf[js.Any])
    
    inline def setƟproviders(value: js.Array[Provider]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: Provider*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
