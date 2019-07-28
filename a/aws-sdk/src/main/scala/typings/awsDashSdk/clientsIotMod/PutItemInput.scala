package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutItemInput extends js.Object {
  /**
    * The table where the message data will be written
    */
  var tableName: TableName
}

object PutItemInput {
  @scala.inline
  def apply(tableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(tableName = tableName)
  
    __obj.asInstanceOf[PutItemInput]
  }
}

