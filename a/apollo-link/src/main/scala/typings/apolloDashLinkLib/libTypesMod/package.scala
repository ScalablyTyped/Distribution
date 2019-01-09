package typings
package apolloDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type FetchResult[TData, C, E] = graphqlLib.executionExecuteMod.ExecutionResult[TData] with (apolloDashLinkLib.Anon_Context[E, C])
  type NextLink = js.Function1[
    /* operation */ Operation, 
    zenDashObservableDashTsLib.libZenObservableMod.Observable[
      FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        stdLib.Record[java.lang.String, js.Any], 
        stdLib.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ Operation, 
    /* forward */ js.UndefOr[NextLink], 
    (zenDashObservableDashTsLib.libZenObservableMod.Observable[
      FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        stdLib.Record[java.lang.String, js.Any], 
        stdLib.Record[java.lang.String, js.Any]
      ]
    ]) | scala.Null
  ]
}
