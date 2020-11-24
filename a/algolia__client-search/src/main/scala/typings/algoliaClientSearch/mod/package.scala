package typings.algoliaClientSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CreateIndex = js.Function2[
    /* indexName */ java.lang.String, 
    /* options */ js.UndefOr[
      typings.algoliaClientSearch.anon.Methods[
        org.scalablytyped.runtime.StringDictionary[
          js.Function1[
            /* base */ typings.algoliaClientSearch.mod.SearchIndex, 
            js.Function1[/* args */ js.Any, js.Any]
          ]
        ]
      ]
    ], 
    typings.algoliaClientSearch.mod.SearchIndex with typings.algoliaClientSearch.algoliaClientSearchStrings.CreateIndex with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  
  type HighlightResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.HighlightResult<THit[KAttribute]> * / object}
    */ typings.algoliaClientSearch.algoliaClientSearchStrings.HighlightResult with org.scalablytyped.runtime.TopLevel[js.Any]) | typings.algoliaClientSearch.mod.HighlightMatch
  
  type Hit[THit] = THit with typings.algoliaClientSearch.anon.DistinctSeqID[THit]
  
  type SnippetResult[THit] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KAttribute in keyof THit ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @algolia/client-search.@algolia/client-search.SnippetResult<THit[KAttribute]> * / object}
    */ typings.algoliaClientSearch.algoliaClientSearchStrings.SnippetResult with org.scalablytyped.runtime.TopLevel[js.Any]) | typings.algoliaClientSearch.mod.SnippetMatch
}
