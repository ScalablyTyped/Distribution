package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queuesMod {
  type JobCallback = js.Function3[
    /* result */ js.Any, 
    /* jobData */ js.Any, 
    /* job */ typings.arangodb.anon.DocumentJob, 
    scala.Unit
  ]
}
