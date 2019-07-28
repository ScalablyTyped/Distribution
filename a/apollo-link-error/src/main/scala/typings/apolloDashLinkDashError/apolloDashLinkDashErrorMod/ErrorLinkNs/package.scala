package typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorResponse
import typings.std.Record
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorLinkNs {
  type ErrorHandler = js.Function1[
    /* error */ ErrorResponse, 
    (Observable[
      FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
    ]) | Unit
  ]
}
