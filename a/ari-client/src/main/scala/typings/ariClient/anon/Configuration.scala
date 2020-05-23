package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var configuration: String
  var logChannelName: String
}

object Configuration {
  @scala.inline
  def apply(configuration: String, logChannelName: String): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

