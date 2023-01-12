package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceResponse extends StObject {
  
  /**
    * The name of the instance.
    */
  var Instance: js.UndefOr[typings.awsSdk.clientsConnectMod.Instance] = js.undefined
}
object DescribeInstanceResponse {
  
  inline def apply(): DescribeInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "Instance", js.undefined)
  }
}
