package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApiKeyTask extends js.Object {
  var createdAt: String
  var key: String
}

object AddApiKeyTask {
  @scala.inline
  def apply(createdAt: String, key: String): AddApiKeyTask = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddApiKeyTask]
  }
}

