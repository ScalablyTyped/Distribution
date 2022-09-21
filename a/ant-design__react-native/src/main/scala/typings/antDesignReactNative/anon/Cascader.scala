package typings.antDesignReactNative.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cascader extends StObject {
  
  var cascader: js.Object | ReactElement
}
object Cascader {
  
  inline def apply(cascader: js.Object | ReactElement): Cascader = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascader]
  }
  
  extension [Self <: Cascader](x: Self) {
    
    inline def setCascader(value: js.Object | ReactElement): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
  }
}
