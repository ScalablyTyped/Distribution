package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxLustreRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Lustre location to describe. 
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationFsxLustreRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationFsxLustreRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxLustreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationFsxLustreRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
