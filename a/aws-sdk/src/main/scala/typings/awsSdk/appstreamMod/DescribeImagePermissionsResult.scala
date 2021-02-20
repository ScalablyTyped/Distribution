package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagePermissionsResult extends StObject {
  
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
  implicit class DescribeImagePermissionsResultMutableBuilder[Self <: DescribeImagePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSharedImagePermissionsList(value: SharedImagePermissionsList): Self = StObject.set(x, "SharedImagePermissionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedImagePermissionsListUndefined: Self = StObject.set(x, "SharedImagePermissionsList", js.undefined)
    
    @scala.inline
    def setSharedImagePermissionsListVarargs(value: SharedImagePermissions*): Self = StObject.set(x, "SharedImagePermissionsList", js.Array(value :_*))
  }
}
