package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashClient.Anon_MutationResult
  import typings.apolloDashClient.coreLocalStateMod.Resolver
  import typings.apolloDashClient.dataQueriesMod.QueryStoreValue
  import typings.std.Record

  type MutationQueryReducer[T] = js.Function2[
    /* previousResult */ Record[String, js.Any], 
    /* options */ Anon_MutationResult[T], 
    Record[String, js.Any]
  ]
  type MutationQueryReducersMap[T] = StringDictionary[MutationQueryReducer[T]]
  type OperationVariables = StringDictionary[js.Any]
  type QueryListener = js.Function3[
    /* queryStoreValue */ QueryStoreValue, 
    /* newData */ js.UndefOr[js.Any], 
    /* forceResolvers */ js.UndefOr[Boolean], 
    Unit
  ]
  type Resolvers = StringDictionary[StringDictionary[Resolver]]
}
