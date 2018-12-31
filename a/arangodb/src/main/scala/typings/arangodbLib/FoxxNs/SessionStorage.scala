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

