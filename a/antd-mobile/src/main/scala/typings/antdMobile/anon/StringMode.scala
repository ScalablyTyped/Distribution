package typings.antdMobile.anon

import typings.antdMobile.antdMobileBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringMode extends StObject {
  
  var stringMode: js.UndefOr[`false`] = js.undefined
}
object StringMode {
  
  inline def apply(): StringMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringMode] (val x: Self) extends AnyVal {
    
    inline def setStringMode(value: `false`): Self = StObject.set(x, "stringMode", value.asInstanceOf[js.Any])
    
    inline def setStringModeUndefined: Self = StObject.set(x, "stringMode", js.undefined)
  }
}
