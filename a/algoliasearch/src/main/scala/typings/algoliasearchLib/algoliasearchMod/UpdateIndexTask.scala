package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://www.algolia.com/doc/api-reference/api-methods/move-index/?language=javascript#response
  * https://www.algolia.com/doc/api-reference/api-methods/copy-index/?language=javascript#response
  */
trait UpdateIndexTask extends js.Object {
  var taskID: scala.Double
  var updatedAt: java.lang.String
}

object UpdateIndexTask {
  @scala.inline
  def apply(taskID: scala.Double, updatedAt: java.lang.String): UpdateIndexTask = {
    val __obj = js.Dynamic.literal(taskID = taskID, updatedAt = updatedAt)
  
    __obj.asInstanceOf[UpdateIndexTask]
  }
}

