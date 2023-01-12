package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuickConnectResponse extends StObject {
  
  /**
    * Information about the quick connect.
    */
  var QuickConnect: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnect] = js.undefined
}
object DescribeQuickConnectResponse {
  
  inline def apply(): DescribeQuickConnectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQuickConnectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQuickConnectResponse] (val x: Self) extends AnyVal {
    
    inline def setQuickConnect(value: QuickConnect): Self = StObject.set(x, "QuickConnect", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectUndefined: Self = StObject.set(x, "QuickConnect", js.undefined)
  }
}
