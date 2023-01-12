package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagesResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of PackageDetails objects.
    */
  var PackageDetailsList: js.UndefOr[typings.awsSdk.clientsEsMod.PackageDetailsList] = js.undefined
}
object DescribePackagesResponse {
  
  inline def apply(): DescribePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackagesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageDetailsList(value: PackageDetailsList): Self = StObject.set(x, "PackageDetailsList", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsListUndefined: Self = StObject.set(x, "PackageDetailsList", js.undefined)
    
    inline def setPackageDetailsListVarargs(value: PackageDetails*): Self = StObject.set(x, "PackageDetailsList", js.Array(value*))
  }
}
