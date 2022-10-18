package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedOpsItem extends StObject {
  
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String
}
object RelatedOpsItem {
  
  inline def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedOpsItem]
  }
  
  extension [Self <: RelatedOpsItem](x: Self) {
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
