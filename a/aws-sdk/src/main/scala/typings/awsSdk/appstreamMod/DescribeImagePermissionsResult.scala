package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagePermissionsResult extends js.Object {
  
  /**
    * The name of the private image.
    */
  var Name: js.UndefOr[typings.awsSdk.appstreamMod.Name] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The permissions for a private image that you own. 
    */
  var SharedImagePermissionsList: js.UndefOr[typings.awsSdk.appstreamMod.SharedImagePermissionsList] = js.native
}
object DescribeImagePermissionsResult {
  
  @scala.inline
  def apply(): DescribeImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagePermissionsResult]
  }
  
  @scala.inline
  implicit class DescribeImagePermissionsResultOps[Self <: DescribeImagePermissionsResult] (val x: Self) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSharedImagePermissionsListVarargs(value: SharedImagePermissions*): Self = this.set("SharedImagePermissionsList", js.Array(value :_*))
    
    @scala.inline
    def setSharedImagePermissionsList(value: SharedImagePermissionsList): Self = this.set("SharedImagePermissionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedImagePermissionsList: Self = this.set("SharedImagePermissionsList", js.undefined)
  }
}
