package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatDetectedByName extends StObject {
  
  /**
    * Total number of infected files identified.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Flag to determine if the finding contains every single infected file-path and/or every threat.
    */
  var Shortened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of identified threats with details, organized by threat name.
    */
  var ThreatNames: js.UndefOr[ScanThreatNames] = js.undefined
  
  /**
    * Total number of unique threats by name identified, as part of the malware scan.
    */
  var UniqueThreatNameCount: js.UndefOr[Integer] = js.undefined
}
object ThreatDetectedByName {
  
  inline def apply(): ThreatDetectedByName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatDetectedByName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreatDetectedByName] (val x: Self) extends AnyVal {
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setShortened(value: Boolean): Self = StObject.set(x, "Shortened", value.asInstanceOf[js.Any])
    
    inline def setShortenedUndefined: Self = StObject.set(x, "Shortened", js.undefined)
    
    inline def setThreatNames(value: ScanThreatNames): Self = StObject.set(x, "ThreatNames", value.asInstanceOf[js.Any])
    
    inline def setThreatNamesUndefined: Self = StObject.set(x, "ThreatNames", js.undefined)
    
    inline def setThreatNamesVarargs(value: ScanThreatName*): Self = StObject.set(x, "ThreatNames", js.Array(value*))
    
    inline def setUniqueThreatNameCount(value: Integer): Self = StObject.set(x, "UniqueThreatNameCount", value.asInstanceOf[js.Any])
    
    inline def setUniqueThreatNameCountUndefined: Self = StObject.set(x, "UniqueThreatNameCount", js.undefined)
  }
}
