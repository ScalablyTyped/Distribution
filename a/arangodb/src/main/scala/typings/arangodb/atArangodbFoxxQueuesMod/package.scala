package typings.arangodb

import typings.arangodb.ArangoDBNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxQueuesMod {
  type JobCallback = js.Function3[/* result */ js.Any, /* jobData */ js.Any, /* job */ Document[Job], Unit]
}
