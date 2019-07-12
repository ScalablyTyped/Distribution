package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
trait BatchTask extends js.Object {
  var objectIDs: js.Array[java.lang.String]
  var taskID: stdLib.Record[java.lang.String, scala.Double]
}

object BatchTask {
  @scala.inline
  def apply(objectIDs: js.Array[java.lang.String], taskID: stdLib.Record[java.lang.String, scala.Double]): BatchTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs, taskID = taskID)
  
    __obj.asInstanceOf[BatchTask]
  }
}

