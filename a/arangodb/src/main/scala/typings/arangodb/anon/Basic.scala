package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basic extends StObject {
  
  var basic: js.UndefOr[Username] = js.undefined
  
  var bearer: js.UndefOr[String] = js.undefined
}
object Basic {
  
  inline def apply(): Basic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basic]
  }
  
  extension [Self <: Basic](x: Self) {
    
    inline def setBasic(value: Username): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    
    inline def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
  }
}
