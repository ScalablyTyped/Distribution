package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationSmbRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SMB location to describe.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationSmbRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationSmbRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationSmbRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationSmbRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
