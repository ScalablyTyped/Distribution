package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserStackAssociationsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The UserStackAssociation objects.
    */
  var UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.native
}

object DescribeUserStackAssociationsResult {
  @scala.inline
  def apply(): DescribeUserStackAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserStackAssociationsResult]
  }
  @scala.inline
  implicit class DescribeUserStackAssociationsResultOps[Self <: DescribeUserStackAssociationsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserStackAssociationsVarargs(value: UserStackAssociation*): Self = this.set("UserStackAssociations", js.Array(value :_*))
    @scala.inline
    def setUserStackAssociations(value: UserStackAssociationList): Self = this.set("UserStackAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStackAssociations: Self = this.set("UserStackAssociations", js.undefined)
  }
  
}

