package typings
package apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorLinkNs {
  type ErrorHandler = js.Function1[
    /* error */ apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod.ErrorResponse, 
    (zenDashObservableDashTsLib.libZenObservableMod.Observable[
      apolloDashLinkLib.libTypesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        stdLib.Record[java.lang.String, js.Any], 
        stdLib.Record[java.lang.String, js.Any]
      ]
    ]) | scala.Unit
  ]
}
