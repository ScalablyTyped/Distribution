package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxWindowsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows File Server location to describe.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationFsxWindowsRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxWindowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationFsxWindowsRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
