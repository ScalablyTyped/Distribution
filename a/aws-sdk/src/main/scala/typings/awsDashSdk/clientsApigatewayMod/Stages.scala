package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stages extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var item: js.UndefOr[ListOfStage] = js.undefined
}

object Stages {
  @scala.inline
  def apply(item: ListOfStage = null): Stages = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[Stages]
  }
}

