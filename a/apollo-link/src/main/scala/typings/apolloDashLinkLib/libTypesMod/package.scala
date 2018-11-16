package typings
package apolloDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type FetchResult[C, E] = graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault] with (apolloDashLinkLib.Anon_Extensions[E, C])
  type NextLink = js.Function1[
    /* operation */ Operation, 
    zenDashObservableDashTsLib.libZenObservableMod.Observable[
      FetchResult[stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ Operation, 
    /* forward */ js.UndefOr[NextLink], 
    (zenDashObservableDashTsLib.libZenObservableMod.Observable[
      FetchResult[stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]]
    ]) | scala.Null
  ]
}
