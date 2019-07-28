package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
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

object Anon_Address {
  @scala.inline
  def apply(address: String = null, collection: String = null, options: js.Any = null): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Address]
  }
}

