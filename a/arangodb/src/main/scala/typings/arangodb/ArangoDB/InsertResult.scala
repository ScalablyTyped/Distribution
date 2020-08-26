package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertResult[T /* <: js.Object */] extends DocumentMetadata {
  var `new`: js.UndefOr[Document[T]] = js.native
}

object InsertResult {
  @scala.inline
  def apply[/* <: js.Object */ T](_id: String, _key: String, _rev: String): InsertResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertResult[T]]
  }
  @scala.inline
  implicit class InsertResultOps[Self <: InsertResult[_], /* <: js.Object */ T] (val x: Self with InsertResult[T]) extends AnyVal {
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
    def setNew(value: Document[T]): Self = this.set("new", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
  }
  
}

