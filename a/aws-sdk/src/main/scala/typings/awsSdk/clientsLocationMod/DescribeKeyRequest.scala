package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyRequest extends StObject {
  
  /**
    * The name of the API key resource.
    */
  var KeyName: ResourceName
}
object DescribeKeyRequest {
  
  inline def apply(KeyName: ResourceName): DescribeKeyRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: ResourceName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
  }
}
