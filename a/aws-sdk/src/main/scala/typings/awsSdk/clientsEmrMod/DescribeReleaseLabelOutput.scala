package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReleaseLabelOutput extends StObject {
  
  /**
    * The list of applications available for the target release label. Name is the name of the application. Version is the concise version of the application.
    */
  var Applications: js.UndefOr[SimplifiedApplicationList] = js.undefined
  
  /**
    * The list of available Amazon Linux release versions for an Amazon EMR release. Contains a Label field that is formatted as shown in  Amazon Linux 2 Release Notes . For example, 2.0.20220218.1.
    */
  var AvailableOSReleases: js.UndefOr[OSReleaseList] = js.undefined
  
  /**
    * The pagination token. Reserved for future use. Currently set to null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The target release label described in the response.
    */
  var ReleaseLabel: js.UndefOr[String] = js.undefined
}
object DescribeReleaseLabelOutput {
  
  inline def apply(): DescribeReleaseLabelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReleaseLabelOutput]
  }
  
  extension [Self <: DescribeReleaseLabelOutput](x: Self) {
    
    inline def setApplications(value: SimplifiedApplicationList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: SimplifiedApplication*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setAvailableOSReleases(value: OSReleaseList): Self = StObject.set(x, "AvailableOSReleases", value.asInstanceOf[js.Any])
    
    inline def setAvailableOSReleasesUndefined: Self = StObject.set(x, "AvailableOSReleases", js.undefined)
    
    inline def setAvailableOSReleasesVarargs(value: OSRelease*): Self = StObject.set(x, "AvailableOSReleases", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReleaseLabel(value: String): Self = StObject.set(x, "ReleaseLabel", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabelUndefined: Self = StObject.set(x, "ReleaseLabel", js.undefined)
  }
}
