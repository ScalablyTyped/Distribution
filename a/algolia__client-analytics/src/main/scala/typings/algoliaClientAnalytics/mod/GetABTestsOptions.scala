package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetABTestsOptions extends js.Object {
  /**
    *  The limit of the number of ab tests returned.
    */
  val limit: js.UndefOr[Double] = js.native
  /**
    * The number of ab tests to skip from the biginning of the list.
    */
  val offset: js.UndefOr[Double] = js.native
}

object GetABTestsOptions {
  @scala.inline
  def apply(): GetABTestsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetABTestsOptions]
  }
  @scala.inline
  implicit class GetABTestsOptionsOps[Self <: GetABTestsOptions] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

