package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiKeyTask extends js.Object {
  var key: String
  var updatedAt: String
}

object UpdateApiKeyTask {
  @scala.inline
  def apply(key: String, updatedAt: String): UpdateApiKeyTask = {
    val __obj = js.Dynamic.literal(key = key, updatedAt = updatedAt)
  
    __obj.asInstanceOf[UpdateApiKeyTask]
  }
}

