package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagePermissionsRequest extends StObject {
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appstreamMod.MaxResults] = js.native
  
  /**
    * The name of the private image for which to describe permissions. The image must be one that you own. 
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The 12-digit identifier of one or more AWS accounts with which the image is shared.
    */
  var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.native
}
object DescribeImagePermissionsRequest {
  
  @scala.inline
  def apply(Name: Name): DescribeImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagePermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeImagePermissionsRequestMutableBuilder[Self <: DescribeImagePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSharedAwsAccountIds(value: AwsAccountIdList): Self = StObject.set(x, "SharedAwsAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAwsAccountIdsUndefined: Self = StObject.set(x, "SharedAwsAccountIds", js.undefined)
    
    @scala.inline
    def setSharedAwsAccountIdsVarargs(value: AwsAccountId*): Self = StObject.set(x, "SharedAwsAccountIds", js.Array(value :_*))
  }
}
