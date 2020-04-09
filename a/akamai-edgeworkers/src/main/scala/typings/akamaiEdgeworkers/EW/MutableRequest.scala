package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Legacy interfaces for backwards compatability
@js.native
trait MutableRequest
  extends MutatesHeaders
     with ReadsHeaders
     with ReadsVariables
     with Request

