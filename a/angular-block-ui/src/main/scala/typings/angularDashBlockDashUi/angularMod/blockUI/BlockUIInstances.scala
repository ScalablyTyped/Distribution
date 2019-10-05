package typings.angularDashBlockDashUi.angularMod.blockUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockUIInstances extends js.Object {
  def get(id: String): BlockUIService
}

object BlockUIInstances {
  @scala.inline
  def apply(get: String => BlockUIService): BlockUIInstances = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[BlockUIInstances]
  }
}

