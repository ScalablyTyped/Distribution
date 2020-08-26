package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indexname extends js.Object {
  /**
    * Index name of the query.
    */
  val index_name: String = js.native
  /**
    * The offset of the query.
    */
  val offset: js.UndefOr[Double] = js.native
  /**
    * Query ID of the query.
    */
  val query_id: js.UndefOr[String] = js.native
  /**
    * The user token of the query.
    */
  val user_token: js.UndefOr[String] = js.native
}

object Indexname {
  @scala.inline
  def apply(index_name: String): Indexname = {
    val __obj = js.Dynamic.literal(index_name = index_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexname]
  }
  @scala.inline
  implicit class IndexnameOps[Self <: Indexname] (val x: Self) extends AnyVal {
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
    def setIndex_name(value: String): Self = this.set("index_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_id: Self = this.set("query_id", js.undefined)
    @scala.inline
    def setUser_token(value: String): Self = this.set("user_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_token: Self = this.set("user_token", js.undefined)
  }
  
}

