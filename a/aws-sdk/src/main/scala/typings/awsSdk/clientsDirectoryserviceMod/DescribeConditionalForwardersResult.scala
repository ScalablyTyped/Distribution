package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConditionalForwardersResult extends StObject {
  
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ConditionalForwarders] = js.undefined
}
object DescribeConditionalForwardersResult {
  
  inline def apply(): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
  
  extension [Self <: DescribeConditionalForwardersResult](x: Self) {
    
    inline def setConditionalForwarders(value: ConditionalForwarders): Self = StObject.set(x, "ConditionalForwarders", value.asInstanceOf[js.Any])
    
    inline def setConditionalForwardersUndefined: Self = StObject.set(x, "ConditionalForwarders", js.undefined)
    
    inline def setConditionalForwardersVarargs(value: ConditionalForwarder*): Self = StObject.set(x, "ConditionalForwarders", js.Array(value*))
  }
}
