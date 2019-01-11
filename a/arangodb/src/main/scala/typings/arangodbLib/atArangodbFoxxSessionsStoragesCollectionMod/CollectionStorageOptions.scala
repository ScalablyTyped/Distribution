package typings
package arangodbLib.atArangodbFoxxSessionsStoragesCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionStorageOptions extends js.Object {
  var autoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var collection: java.lang.String | arangodbLib.ArangoDBNs.Collection[_]
  var pruneExpired: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

