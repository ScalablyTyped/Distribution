package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.SearchOptions
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3V4V5 extends StObject {
  
  // @ts-ignore
  var v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.QueryParameters */ Any
  
  // @ts-ignore
  var v4: SearchOptions
  
  var v5: NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify // @ts-ignore
  AlgoliaSearch.LegacySearchMethodProps * / any[number]['params'] */ js.Any
  ]
}
object V3V4V5 {
  
  inline def apply(
    v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.QueryParameters */ Any,
    v4: SearchOptions,
    v5: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify // @ts-ignore
  AlgoliaSearch.LegacySearchMethodProps * / any[number]['params'] */ js.Any
    ]
  ): V3V4V5 = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3V4V5]
  }
  
  extension [Self <: V3V4V5](x: Self) {
    
    inline def setV3(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlgoliaSearch.QueryParameters */ Any
    ): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: SearchOptions): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(
      value: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify // @ts-ignore
    AlgoliaSearch.LegacySearchMethodProps * / any[number]['params'] */ js.Any
        ]
    ): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
