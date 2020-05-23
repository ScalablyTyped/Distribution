package typings.arangodb.ArangoDB

import typings.arangodb.anon.ExecutionTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExtra extends js.Object {
  var stats: ExecutionTime
  var warnings: js.Array[String]
}

object QueryExtra {
  @scala.inline
  def apply(stats: ExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExtra]
  }
}

