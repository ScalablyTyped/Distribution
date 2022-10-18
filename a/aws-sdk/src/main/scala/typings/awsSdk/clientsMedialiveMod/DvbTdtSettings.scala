package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbTdtSettings extends StObject {
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin1000Max30000] = js.undefined
}
object DvbTdtSettings {
  
  inline def apply(): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbTdtSettings]
  }
  
  extension [Self <: DvbTdtSettings](x: Self) {
    
    inline def setRepInterval(value: integerMin1000Max30000): Self = StObject.set(x, "RepInterval", value.asInstanceOf[js.Any])
    
    inline def setRepIntervalUndefined: Self = StObject.set(x, "RepInterval", js.undefined)
  }
}
