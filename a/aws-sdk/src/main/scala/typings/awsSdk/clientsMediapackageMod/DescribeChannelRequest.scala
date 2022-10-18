package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelRequest extends StObject {
  
  /**
    * The ID of a Channel.
    */
  var Id: string
}
object DescribeChannelRequest {
  
  inline def apply(Id: string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  
  extension [Self <: DescribeChannelRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
