package typings.algoliaClientRecommendation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetName extends js.Object {
  var facetName: String = js.native
  var score: Double = js.native
}

object FacetName {
  @scala.inline
  def apply(facetName: String, score: Double): FacetName = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetName]
  }
  @scala.inline
  implicit class FacetNameOps[Self <: FacetName] (val x: Self) extends AnyVal {
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
    def setFacetName(value: String): Self = this.set("facetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
  
}

