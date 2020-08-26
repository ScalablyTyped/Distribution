package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionSessionStorage extends SessionStorage {
  def clear(session: Session): Boolean = js.native
  @JSName("new")
  def new_MCollectionSessionStorage(): Session = js.native
  def prune(): js.Array[String] = js.native
  def save(session: Session): Session = js.native
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
  @scala.inline
  implicit class CollectionSessionStorageOps[Self <: CollectionSessionStorage] (val x: Self) extends AnyVal {
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
    def setClear(value: Session => Boolean): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setNew(value: () => Session): Self = this.set("new", js.Any.fromFunction0(value))
    @scala.inline
    def setPrune(value: () => js.Array[String]): Self = this.set("prune", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: Session => Session): Self = this.set("save", js.Any.fromFunction1(value))
  }
  
}

