package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParam extends StObject {
  
  /**
    * The keys associated with an update request.
    */
  var `type`: js.UndefOr[UpdateParamType] = js.undefined
  
  /**
    * The value of the keys submitted as part of an update request.
    */
  var value: js.UndefOr[String] = js.undefined
}
object UpdateParam {
  
  inline def apply(): UpdateParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParam] (val x: Self) extends AnyVal {
    
    inline def setType(value: UpdateParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
