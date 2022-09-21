package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyContent extends StObject {
  
  var bodyContent: ReactNode
  
  var customize: Boolean
}
object BodyContent {
  
  inline def apply(customize: Boolean): BodyContent = {
    val __obj = js.Dynamic.literal(customize = customize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyContent]
  }
  
  extension [Self <: BodyContent](x: Self) {
    
    inline def setBodyContent(value: ReactNode): Self = StObject.set(x, "bodyContent", value.asInstanceOf[js.Any])
    
    inline def setBodyContentUndefined: Self = StObject.set(x, "bodyContent", js.undefined)
    
    inline def setCustomize(value: Boolean): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
  }
}
