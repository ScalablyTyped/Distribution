package typings
package agendaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  /**
    * The connection URL.
    * Required when using `db` option to connect.
    * Not required when an existing connection is passed as `mongo` property.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the collection to use.
    */
  var collection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Connection options to pass to MongoDB.
    * Not required when an existing connection is passed as `mongo` property.
    */
  var options: js.UndefOr[js.Any] = js.undefined
}

