package typings.antDesignReactNative.anon

import typings.antDesignReactNative.libRadioDemoBasicMod.RadioValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var value: RadioValue
}
object `1` {
  
  inline def apply(value: RadioValue): `1` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
