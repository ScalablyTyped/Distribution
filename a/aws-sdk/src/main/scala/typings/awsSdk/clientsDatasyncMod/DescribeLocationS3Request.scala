package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationS3Request extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationS3Request {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationS3Request = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationS3Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationS3Request] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
