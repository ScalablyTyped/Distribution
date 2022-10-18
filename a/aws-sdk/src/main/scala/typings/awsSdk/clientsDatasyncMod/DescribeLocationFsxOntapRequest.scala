package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxOntapRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the FSx for ONTAP file system location that you want information about.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationFsxOntapRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationFsxOntapRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxOntapRequest]
  }
  
  extension [Self <: DescribeLocationFsxOntapRequest](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
