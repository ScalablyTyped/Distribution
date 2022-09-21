package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.MultipleQueriesResponse
import typings.algoliasearchHelper.algoliasearchMod.SearchResponses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3Any[T] extends StObject {
  
  // @ts-ignore
  var v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.MultiResponse<T> */ Any
  
  // @ts-ignore
  var v4: MultipleQueriesResponse[T]
  
  // @ts-ignore
  var v5: SearchResponses[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]
}
object V3Any {
  
  inline def apply[T](
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.MultiResponse<T> */ Any,
    v4: MultipleQueriesResponse[T],
    v5: SearchResponses[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ]
  ): V3Any[T] = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3Any[T]]
  }
  
  extension [Self <: V3Any[?], T](x: Self & V3Any[T]) {
    
    inline def setV3(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.MultiResponse<T> */ Any
    ): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: MultipleQueriesResponse[T]): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(
      value: SearchResponses[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
    ): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
