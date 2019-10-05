package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSessionStorage extends SessionStorage {
  def clear(session: Session): Boolean
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  def prune(): js.Array[String]
  def save(session: Session): Session
}

object CollectionSessionStorage {
  @scala.inline
  def apply(
    clear: Session => Boolean,
    forClient: Session => String | Null,
    fromClient: String => Session | Null,
    `new`: () => Session,
    prune: () => js.Array[String],
    save: Session => Session
  ): CollectionSessionStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient), prune = js.Any.fromFunction0(prune), save = js.Any.fromFunction1(save))
    __obj.updateDynamic("new")(js.Any.fromFunction0(`new`))
    __obj.asInstanceOf[CollectionSessionStorage]
  }
}

