package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back extends StObject {
  
  var back: String
}
object Back {
  
  inline def apply(back: String): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
    
    inline def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
  }
}
