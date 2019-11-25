package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
trait MultiObjectTask extends js.Object {
  var objectIDs: js.Array[String]
  var taskID: Double
}

object MultiObjectTask {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Double): MultiObjectTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiObjectTask]
  }
}

