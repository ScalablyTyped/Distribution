package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigClass extends js.Object {
  var configClass: String
  var id: String
  var objectType: String
}

object ConfigClass {
  @scala.inline
  def apply(configClass: String, id: String, objectType: String): ConfigClass = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigClass]
  }
}

