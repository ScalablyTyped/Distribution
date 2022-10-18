package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the layout.
    */
  var layoutArn: LayoutArn
  
  /**
    * The unique identifier for of the layout.
    */
  var layoutId: LayoutId
  
  /**
    * The name of the layout.
    */
  var name: LayoutName
}
object LayoutSummary {
  
  inline def apply(layoutArn: LayoutArn, layoutId: LayoutId, name: LayoutName): LayoutSummary = {
    val __obj = js.Dynamic.literal(layoutArn = layoutArn.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSummary]
  }
  
  extension [Self <: LayoutSummary](x: Self) {
    
    inline def setLayoutArn(value: LayoutArn): Self = StObject.set(x, "layoutArn", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: LayoutId): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setName(value: LayoutName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
