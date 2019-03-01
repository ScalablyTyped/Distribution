package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionStorage extends js.Object {
  var `new`: js.UndefOr[js.Function0[Session]] = js.undefined
  def forClient(session: Session): java.lang.String | scala.Null
  def fromClient(sid: java.lang.String): Session | scala.Null
}

object SessionStorage {
  @scala.inline
  def apply(
    forClient: js.Function1[Session, java.lang.String | scala.Null],
    fromClient: js.Function1[java.lang.String, Session | scala.Null],
    `new`: js.Function0[Session] = null
  ): SessionStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forClient")(forClient)
    __obj.updateDynamic("fromClient")(fromClient)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[SessionStorage]
  }
}

