package typings.astring.anon

import typings.astring.astringStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var `type`: ImportNamespaceSpecifier
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
