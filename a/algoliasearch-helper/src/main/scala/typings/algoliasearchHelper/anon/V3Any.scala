package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.SearchForFacetValuesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3Any extends StObject {
  
  // @ts-ignore
  var v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.SearchForFacetValues.Response */ Any
  
  // @ts-ignore
  var v4: SearchForFacetValuesResponse
  
  // @ts-ignore
  var v5: typings.algoliasearchHelper.typesAlgoliasearchMod.SearchForFacetValuesResponse
}
object V3Any {
  
  inline def apply(
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.SearchForFacetValues.Response */ Any,
    v4: SearchForFacetValuesResponse,
    v5: typings.algoliasearchHelper.typesAlgoliasearchMod.SearchForFacetValuesResponse
  ): V3Any = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3Any]
  }
  
  extension [Self <: V3Any](x: Self) {
    
    inline def setV3(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.SearchForFacetValues.Response */ Any
    ): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: SearchForFacetValuesResponse): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: typings.algoliasearchHelper.typesAlgoliasearchMod.SearchForFacetValuesResponse): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
