package typings.arangodb.ArangoDB

import typings.arangodb.AnonExecutionTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExtra extends js.Object {
  var stats: AnonExecutionTime
  var warnings: js.Array[String]
}

object QueryExtra {
  @scala.inline
  def apply(stats: AnonExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExtra]
  }
}

