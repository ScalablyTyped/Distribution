package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationHdfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the HDFS cluster location to describe.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationHdfsRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationHdfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationHdfsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocationHdfsRequest] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
