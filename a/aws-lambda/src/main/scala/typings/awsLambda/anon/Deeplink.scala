package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deeplink extends js.Object {
  var `deep-link`: String
  var `group-name`: String
  var `stream-name`: String
}

object Deeplink {
  @scala.inline
  def apply(`deep-link`: String, `group-name`: String, `stream-name`: String): Deeplink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deep-link")(`deep-link`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-name")(`group-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-name")(`stream-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeplink]
  }
}

