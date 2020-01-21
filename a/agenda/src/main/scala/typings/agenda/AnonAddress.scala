package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  /**
    * The connection URL.
    * Required when using `db` option to connect.
    * Not required when an existing connection is passed as `mongo` property.
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * The name of the collection to use.
    */
  var collection: js.UndefOr[String] = js.undefined
  /**
    * Connection options to pass to MongoDB.
    * Not required when an existing connection is passed as `mongo` property.
    */
  var options: js.UndefOr[js.Any] = js.undefined
}

object AnonAddress {
  @scala.inline
  def apply(address: String = null, collection: String = null, options: js.Any = null): AnonAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

