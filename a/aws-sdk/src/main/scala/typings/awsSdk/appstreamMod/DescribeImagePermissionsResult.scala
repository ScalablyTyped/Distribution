package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagePermissionsResult extends StObject {
  
  /**
    * The name of the private image.
    */
  var Name: js.UndefOr[typings.awsSdk.appstreamMod.Name] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The permissions for a private image that you own. 
    */
  var SharedImagePermissionsList: js.UndefOr[typings.awsSdk.appstreamMod.SharedImagePermissionsList] = js.undefined
}
object DescribeImagePermissionsResult {
  
  inline def apply(): DescribeImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagePermissionsResult]
  }
  
  extension [Self <: DescribeImagePermissionsResult](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSharedImagePermissionsList(value: SharedImagePermissionsList): Self = StObject.set(x, "SharedImagePermissionsList", value.asInstanceOf[js.Any])
    
    inline def setSharedImagePermissionsListUndefined: Self = StObject.set(x, "SharedImagePermissionsList", js.undefined)
    
    inline def setSharedImagePermissionsListVarargs(value: SharedImagePermissions*): Self = StObject.set(x, "SharedImagePermissionsList", js.Array(value :_*))
  }
}
