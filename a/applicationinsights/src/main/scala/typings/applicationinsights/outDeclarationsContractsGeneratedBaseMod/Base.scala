package typings.applicationinsights.outDeclarationsContractsGeneratedBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  /**
    * Name of item (B section) if any. If telemetry data is derived straight from this, this should be null.
    */
  var baseType: String
}

object Base {
  @scala.inline
  def apply(baseType: String): Base = {
    val __obj = js.Dynamic.literal(baseType = baseType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Base]
  }
}

