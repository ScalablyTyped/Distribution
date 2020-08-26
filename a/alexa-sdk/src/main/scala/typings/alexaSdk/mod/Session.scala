package typings.alexaSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var application: Application = js.native
  var attributes: StringDictionary[js.Any] = js.native
  var `new`: Boolean = js.native
  var sessionId: String = js.native
  var user: SessionUser = js.native
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
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew(value: Boolean): Self = this.set("new", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: SessionUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

