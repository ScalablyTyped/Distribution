package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptParameterKeyValue extends StObject {
  
  /**
    * A script parameter key.
    */
  var key: js.UndefOr[ScriptParameterKey] = js.undefined
  
  /**
    * A script parameter value.
    */
  var value: js.UndefOr[ScriptParameterValue] = js.undefined
}
object ScriptParameterKeyValue {
  
  inline def apply(): ScriptParameterKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptParameterKeyValue]
  }
  
  extension [Self <: ScriptParameterKeyValue](x: Self) {
    
    inline def setKey(value: ScriptParameterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: ScriptParameterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
