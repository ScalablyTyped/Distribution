package typings.antDesignReactNative.anon

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'body'> */
trait PickCardStylebody extends StObject {
  
  var body: ViewStyle
}
object PickCardStylebody {
  
  inline def apply(body: ViewStyle): PickCardStylebody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStylebody]
  }
  
  extension [Self <: PickCardStylebody](x: Self) {
    
    inline def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
