package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMetadata extends StObject {
  
  /**
    * Information about the event associated with a code review.
    */
  var EventInfo: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.EventInfo] = js.undefined
  
  /**
    * The ID of the request. This is required for a pull request code review.
    */
  var RequestId: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RequestId] = js.undefined
  
  /**
    * An identifier, such as a name or account ID, that is associated with the requester. The Requester is used to capture the author/actor name of the event request.
    */
  var Requester: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Requester] = js.undefined
  
  /**
    * The name of the repository vendor used to upload code to an S3 bucket for a CI/CD code review. For example, if code and artifacts are uploaded to an S3 bucket for a CI/CD code review by GitHub scripts from a GitHub repository, then the repository association's ProviderType is S3Bucket and the CI/CD repository vendor name is GitHub. For more information, see the definition for ProviderType in RepositoryAssociation.
    */
  var VendorName: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.VendorName] = js.undefined
}
object RequestMetadata {
  
  inline def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestMetadata] (val x: Self) extends AnyVal {
    
    inline def setEventInfo(value: EventInfo): Self = StObject.set(x, "EventInfo", value.asInstanceOf[js.Any])
    
    inline def setEventInfoUndefined: Self = StObject.set(x, "EventInfo", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setRequester(value: Requester): Self = StObject.set(x, "Requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "Requester", js.undefined)
    
    inline def setVendorName(value: VendorName): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    inline def setVendorNameUndefined: Self = StObject.set(x, "VendorName", js.undefined)
  }
}
