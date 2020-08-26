package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * List of index response
    */
  var items: js.Array[Indice] = js.native
  /**
    * Number of pages
    */
  var nbPages: Double = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(items: js.Array[Indice], nbPages: Double): ListIndicesResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
  @scala.inline
  implicit class ListIndicesResponseOps[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Indice*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Indice]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbPages(value: Double): Self = this.set("nbPages", value.asInstanceOf[js.Any])
  }
  
}

