package typings.apolloDashLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashLink.Anon_Context
  import typings.graphql.executionExecuteMod.ExecutionResult
  import typings.std.Record
  import typings.zenDashObservableDashTs.libZenObservableMod.Observable

  type FetchResult[TData, C, E] = ExecutionResult[TData] with (Anon_Context[E, C])
  type NextLink = js.Function1[
    /* operation */ Operation, 
    Observable[
      FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ Operation, 
    /* forward */ js.UndefOr[NextLink], 
    (Observable[
      FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
    ]) | Null
  ]
}
