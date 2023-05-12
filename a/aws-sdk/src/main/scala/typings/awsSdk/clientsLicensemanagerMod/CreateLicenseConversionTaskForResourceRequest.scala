package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseConversionTaskForResourceRequest extends StObject {
  
  /**
    * Information that identifies the license type you are converting to. For the structure of the destination license, see Convert a license type using the CLI  in the License Manager User Guide.
    */
  var DestinationLicenseContext: LicenseConversionContext
  
  /**
    * Amazon Resource Name (ARN) of the resource you are converting the license type for.
    */
  var ResourceArn: Arn
  
  /**
    * Information that identifies the license type you are converting from. For the structure of the source license, see Convert a license type using the CLI  in the License Manager User Guide.
    */
  var SourceLicenseContext: LicenseConversionContext
}
object CreateLicenseConversionTaskForResourceRequest {
  
  inline def apply(
    DestinationLicenseContext: LicenseConversionContext,
    ResourceArn: Arn,
    SourceLicenseContext: LicenseConversionContext
  ): CreateLicenseConversionTaskForResourceRequest = {
    val __obj = js.Dynamic.literal(DestinationLicenseContext = DestinationLicenseContext.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any], SourceLicenseContext = SourceLicenseContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseConversionTaskForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLicenseConversionTaskForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationLicenseContext(value: LicenseConversionContext): Self = StObject.set(x, "DestinationLicenseContext", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceLicenseContext(value: LicenseConversionContext): Self = StObject.set(x, "SourceLicenseContext", value.asInstanceOf[js.Any])
  }
}
