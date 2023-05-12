package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoMLJobV2Request extends StObject {
  
  /**
    * Requests information about an AutoML V2 job using its unique name.
    */
  var AutoMLJobName: typings.awsSdk.clientsSagemakerMod.AutoMLJobName
}
object DescribeAutoMLJobV2Request {
  
  inline def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobV2Request = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobV2Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAutoMLJobV2Request] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
  }
}
