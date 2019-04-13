package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreTypesMod {
  type MutationQueryReducer[T] = js.Function2[
    /* previousResult */ stdLib.Record[java.lang.String, js.Any], 
    /* options */ apolloDashClientLib.Anon_MutationResult[T], 
    stdLib.Record[java.lang.String, js.Any]
  ]
  type MutationQueryReducersMap[T] = org.scalablytyped.runtime.StringDictionary[MutationQueryReducer[T]]
  type OperationVariables = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryListener = js.Function3[
    /* queryStoreValue */ apolloDashClientLib.dataQueriesMod.QueryStoreValue, 
    /* newData */ js.UndefOr[js.Any], 
    /* forceResolvers */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type Resolvers = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* rootValue */ js.UndefOr[js.Any], 
        /* args */ js.UndefOr[js.Any], 
        /* context */ js.UndefOr[js.Any], 
        /* info */ js.UndefOr[js.Any], 
        js.Any
      ]
    ]
  ]
}
