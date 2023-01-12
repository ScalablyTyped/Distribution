package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationObjectStorageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the object storage system location that you want information about.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationObjectStorageRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationObjectStorageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
