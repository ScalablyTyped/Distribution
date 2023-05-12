package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkSingleStartImportInfo extends StObject {
  
  /**
    * The Sidewalk manufacturing serial number (SMSN) of the device added to the import task.
    */
  var SidewalkManufacturingSn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.SidewalkManufacturingSn] = js.undefined
}
object SidewalkSingleStartImportInfo {
  
  inline def apply(): SidewalkSingleStartImportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkSingleStartImportInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkSingleStartImportInfo] (val x: Self) extends AnyVal {
    
    inline def setSidewalkManufacturingSn(value: SidewalkManufacturingSn): Self = StObject.set(x, "SidewalkManufacturingSn", value.asInstanceOf[js.Any])
    
    inline def setSidewalkManufacturingSnUndefined: Self = StObject.set(x, "SidewalkManufacturingSn", js.undefined)
  }
}
