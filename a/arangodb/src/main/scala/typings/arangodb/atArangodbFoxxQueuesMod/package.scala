package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxQueuesMod {
  import typings.arangodb.ArangoDB.Document

  type JobCallback = js.Function3[/* result */ js.Any, /* jobData */ js.Any, /* job */ Document[Job], Unit]
}
