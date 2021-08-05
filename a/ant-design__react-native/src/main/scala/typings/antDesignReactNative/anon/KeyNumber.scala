package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.portalHostMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyNumber
  extends StObject
     with Operation {
  
  var key: Double
  
  var `type`: unmount
}
object KeyNumber {
  
  inline def apply(key: Double): KeyNumber = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unmount")
    __obj.asInstanceOf[KeyNumber]
  }
  
  extension [Self <: KeyNumber](x: Self) {
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: unmount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
