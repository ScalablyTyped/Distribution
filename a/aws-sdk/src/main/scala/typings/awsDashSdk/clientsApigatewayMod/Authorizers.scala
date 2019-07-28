package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorizers extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfAuthorizer] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object Authorizers {
  @scala.inline
  def apply(items: ListOfAuthorizer = null, position: String = null): Authorizers = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Authorizers]
  }
}

