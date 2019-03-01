package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var application: Application
  var attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  var `new`: scala.Boolean
  var sessionId: java.lang.String
  var user: SessionUser
}

object Session {
  @scala.inline
  def apply(
    application: Application,
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    `new`: scala.Boolean,
    sessionId: java.lang.String,
    user: SessionUser
  ): Session = {
    val __obj = js.Dynamic.literal(`new` = `new`)
    __obj.updateDynamic("application")(application)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Session]
  }
}

