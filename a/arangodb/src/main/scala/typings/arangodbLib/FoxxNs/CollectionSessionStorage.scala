package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSessionStorage extends SessionStorage {
  def clear(session: Session): scala.Boolean
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  def prune(): js.Array[java.lang.String]
  def save(session: Session): Session
}

object CollectionSessionStorage {
  @scala.inline
  def apply(
    clear: js.Function1[Session, scala.Boolean],
    forClient: js.Function1[Session, java.lang.String | scala.Null],
    fromClient: js.Function1[java.lang.String, Session | scala.Null],
    `new`: js.Function0[Session],
    prune: js.Function0[js.Array[java.lang.String]],
    save: js.Function1[Session, Session]
  ): CollectionSessionStorage = {
    val __obj = js.Dynamic.literal(clear = clear, forClient = forClient, fromClient = fromClient, prune = prune, save = save)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[CollectionSessionStorage]
  }
}

