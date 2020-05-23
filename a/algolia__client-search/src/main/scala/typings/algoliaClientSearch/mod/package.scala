package typings.algoliaClientSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}
