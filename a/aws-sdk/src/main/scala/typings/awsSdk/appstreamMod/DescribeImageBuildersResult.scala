package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImageBuildersResult extends js.Object {
  /**
    * Information about the image builders.
    */
  var ImageBuilders: js.UndefOr[ImageBuilderList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImageBuildersResult {
  @scala.inline
  def apply(): DescribeImageBuildersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageBuildersResult]
  }
  @scala.inline
  implicit class DescribeImageBuildersResultOps[Self <: DescribeImageBuildersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageBuildersVarargs(value: ImageBuilder*): Self = this.set("ImageBuilders", js.Array(value :_*))
    @scala.inline
    def setImageBuilders(value: ImageBuilderList): Self = this.set("ImageBuilders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBuilders: Self = this.set("ImageBuilders", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

