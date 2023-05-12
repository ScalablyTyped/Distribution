package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedWirelessDevice extends StObject {
  
  /**
    * The Sidewalk-related information about a device that has been added to an import task.
    */
  var Sidewalk: js.UndefOr[ImportedSidewalkDevice] = js.undefined
}
object ImportedWirelessDevice {
  
  inline def apply(): ImportedWirelessDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportedWirelessDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportedWirelessDevice] (val x: Self) extends AnyVal {
    
    inline def setSidewalk(value: ImportedSidewalkDevice): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
