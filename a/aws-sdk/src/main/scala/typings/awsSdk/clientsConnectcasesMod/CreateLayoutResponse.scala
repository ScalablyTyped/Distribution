package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLayoutResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the newly created layout.
    */
  var layoutArn: LayoutArn
  
  /**
    * The unique identifier of the layout.
    */
  var layoutId: LayoutId
}
object CreateLayoutResponse {
  
  inline def apply(layoutArn: LayoutArn, layoutId: LayoutId): CreateLayoutResponse = {
    val __obj = js.Dynamic.literal(layoutArn = layoutArn.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLayoutResponse]
  }
  
  extension [Self <: CreateLayoutResponse](x: Self) {
    
    inline def setLayoutArn(value: LayoutArn): Self = StObject.set(x, "layoutArn", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: LayoutId): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
  }
}
