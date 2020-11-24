package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesRequest extends js.Object {
  
  /**
    * The ARNs of the public, private, and shared images to describe.
    */
  var Arns: js.UndefOr[ArnList] = js.native
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.native
  
  /**
    * The names of the public or private images to describe.
    */
  var Names: js.UndefOr[StringList] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The type of image (public, private, or shared) to describe. 
    */
  var Type: js.UndefOr[VisibilityType] = js.native
}
object DescribeImagesRequest {
  
  @scala.inline
  def apply(): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeImagesRequestOps[Self <: DescribeImagesRequest] (val x: Self) extends AnyVal {
    
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
    def setArnsVarargs(value: Arn*): Self = this.set("Arns", js.Array(value :_*))
    
    @scala.inline
    def setArns(value: ArnList): Self = this.set("Arns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArns: Self = this.set("Arns", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeImagesMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: StringList): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setType(value: VisibilityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
