package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetHit extends js.Object {
  /**
    * The count.
    */
  val count: Double = js.native
  /**
    * The highlighted value.
    */
  val highlighted: String = js.native
  /**
    * The value of the facet.
    */
  val value: String = js.native
}

object FacetHit {
  @scala.inline
  def apply(count: Double, highlighted: String, value: String): FacetHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetHit]
  }
  @scala.inline
  implicit class FacetHitOps[Self <: FacetHit] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlighted(value: String): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

