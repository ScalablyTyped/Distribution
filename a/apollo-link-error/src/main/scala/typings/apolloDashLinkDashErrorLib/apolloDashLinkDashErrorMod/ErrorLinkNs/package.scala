package typings
package apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorLinkNs {
  /**
       * Callback to be triggered when an error occurs within the link stack.
       */
  type ErrorHandler = js.Function1[
    /* error */ apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod.ErrorResponse, 
    scala.Unit
  ]
}
