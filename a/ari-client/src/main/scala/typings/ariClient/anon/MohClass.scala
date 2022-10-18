package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MohClass extends StObject {
  
  var mohClass: js.UndefOr[String] = js.undefined
}
object MohClass {
  
  inline def apply(): MohClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MohClass]
  }
  
  extension [Self <: MohClass](x: Self) {
    
    inline def setMohClass(value: String): Self = StObject.set(x, "mohClass", value.asInstanceOf[js.Any])
    
    inline def setMohClassUndefined: Self = StObject.set(x, "mohClass", js.undefined)
  }
}
