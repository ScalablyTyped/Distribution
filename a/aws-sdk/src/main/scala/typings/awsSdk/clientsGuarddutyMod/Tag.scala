package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The EC2 instance tag key.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The EC2 instance tag value.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Tag {
  
  inline def apply(): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
