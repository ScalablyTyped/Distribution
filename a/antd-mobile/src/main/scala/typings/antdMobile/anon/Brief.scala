package typings.antdMobile.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brief extends StObject {
  
  var brief: ReactNode
  
  var index: String
}
object Brief {
  
  inline def apply(index: String): Brief = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brief]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brief] (val x: Self) extends AnyVal {
    
    inline def setBrief(value: ReactNode): Self = StObject.set(x, "brief", value.asInstanceOf[js.Any])
    
    inline def setBriefUndefined: Self = StObject.set(x, "brief", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
