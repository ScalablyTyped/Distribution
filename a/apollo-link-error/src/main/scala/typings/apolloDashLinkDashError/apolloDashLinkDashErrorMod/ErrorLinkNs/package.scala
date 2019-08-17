package typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorLinkNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashLink.libTypesMod.FetchResult
  import typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorResponse
  import typings.std.Record
  import typings.zenDashObservableDashTs.libZenObservableMod.Observable

  type ErrorHandler = js.Function1[
    /* error */ ErrorResponse, 
    (Observable[
      FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
    ]) | Unit
  ]
}
