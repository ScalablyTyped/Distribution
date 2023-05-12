package typings.antdMobile.anon

import typings.antdMobile.antdMobileBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var stringMode: `true`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(stringMode = true)
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setStringMode(value: `true`): Self = StObject.set(x, "stringMode", value.asInstanceOf[js.Any])
  }
}
