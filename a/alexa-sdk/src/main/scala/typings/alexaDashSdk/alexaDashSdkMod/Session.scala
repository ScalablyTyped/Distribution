package typings.alexaDashSdk.alexaDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var application: Application
  var attributes: StringDictionary[js.Any]
  var `new`: Boolean
  var sessionId: String
  var user: SessionUser
}

object Session {
  @scala.inline
  def apply(
    application: Application,
    attributes: StringDictionary[js.Any],
    `new`: Boolean,
    sessionId: String,
    user: SessionUser
  ): Session = {
    val __obj = js.Dynamic.literal(application = application, attributes = attributes, sessionId = sessionId, user = user)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[Session]
  }
}

