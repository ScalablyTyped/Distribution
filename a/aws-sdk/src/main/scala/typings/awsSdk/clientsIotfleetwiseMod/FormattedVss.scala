package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedVss extends StObject {
  
  /**
    * Provides the VSS in JSON format.
    */
  var vssJson: js.UndefOr[String] = js.undefined
}
object FormattedVss {
  
  inline def apply(): FormattedVss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattedVss]
  }
  
  extension [Self <: FormattedVss](x: Self) {
    
    inline def setVssJson(value: String): Self = StObject.set(x, "vssJson", value.asInstanceOf[js.Any])
    
    inline def setVssJsonUndefined: Self = StObject.set(x, "vssJson", js.undefined)
  }
}
