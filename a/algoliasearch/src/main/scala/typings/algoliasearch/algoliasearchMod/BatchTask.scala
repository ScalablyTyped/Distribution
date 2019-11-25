package typings.algoliasearch.algoliasearchMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
trait BatchTask extends js.Object {
  var objectIDs: js.Array[String]
  var taskID: Record[String, Double]
}

object BatchTask {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Record[String, Double]): BatchTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchTask]
  }
}

