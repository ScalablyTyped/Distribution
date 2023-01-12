package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxOpenZfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for OpenZFS location to describe.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationFsxOpenZfsRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationFsxOpenZfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxOpenZfsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationFsxOpenZfsRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
