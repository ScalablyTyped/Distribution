package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPrefix extends StObject {
  
  /**
    * Container for the specified common prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
}
object CommonPrefix {
  
  inline def apply(): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonPrefix]
  }
  
  extension [Self <: CommonPrefix](x: Self) {
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
