package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpCity extends StObject {
  
  /**
    * The name of the city.
    */
  var name: js.UndefOr[string] = js.undefined
}
object IpCity {
  
  inline def apply(): IpCity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpCity]
  }
  
  extension [Self <: IpCity](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
