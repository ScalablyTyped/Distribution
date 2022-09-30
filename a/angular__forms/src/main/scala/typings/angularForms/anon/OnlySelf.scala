package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlySelf extends StObject {
  
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}
object OnlySelf {
  
  inline def apply(): OnlySelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySelf]
  }
  
  extension [Self <: OnlySelf](x: Self) {
    
    inline def setOnlySelf(value: Boolean): Self = StObject.set(x, "onlySelf", value.asInstanceOf[js.Any])
    
    inline def setOnlySelfUndefined: Self = StObject.set(x, "onlySelf", js.undefined)
  }
}
