package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginGroupFailover extends StObject {
  
  /**
    * Information about the status codes that cause an origin group to fail over.
    */
  var StatusCodes: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes] = js.undefined
}
object AwsCloudFrontDistributionOriginGroupFailover {
  
  inline def apply(): AwsCloudFrontDistributionOriginGroupFailover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionOriginGroupFailover] (val x: Self) extends AnyVal {
    
    inline def setStatusCodes(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
    
    inline def setStatusCodesUndefined: Self = StObject.set(x, "StatusCodes", js.undefined)
  }
}
