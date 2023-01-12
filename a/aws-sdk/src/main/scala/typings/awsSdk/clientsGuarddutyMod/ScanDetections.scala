package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanDetections extends StObject {
  
  /**
    * Details of the highest severity threat detected during malware scan and number of infected files.
    */
  var HighestSeverityThreatDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.HighestSeverityThreatDetails] = js.undefined
  
  /**
    * Total number of scanned files.
    */
  var ScannedItemCount: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ScannedItemCount] = js.undefined
  
  /**
    * Contains details about identified threats organized by threat name.
    */
  var ThreatDetectedByName: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ThreatDetectedByName] = js.undefined
  
  /**
    * Total number of infected files.
    */
  var ThreatsDetectedItemCount: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ThreatsDetectedItemCount] = js.undefined
}
object ScanDetections {
  
  inline def apply(): ScanDetections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanDetections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanDetections] (val x: Self) extends AnyVal {
    
    inline def setHighestSeverityThreatDetails(value: HighestSeverityThreatDetails): Self = StObject.set(x, "HighestSeverityThreatDetails", value.asInstanceOf[js.Any])
    
    inline def setHighestSeverityThreatDetailsUndefined: Self = StObject.set(x, "HighestSeverityThreatDetails", js.undefined)
    
    inline def setScannedItemCount(value: ScannedItemCount): Self = StObject.set(x, "ScannedItemCount", value.asInstanceOf[js.Any])
    
    inline def setScannedItemCountUndefined: Self = StObject.set(x, "ScannedItemCount", js.undefined)
    
    inline def setThreatDetectedByName(value: ThreatDetectedByName): Self = StObject.set(x, "ThreatDetectedByName", value.asInstanceOf[js.Any])
    
    inline def setThreatDetectedByNameUndefined: Self = StObject.set(x, "ThreatDetectedByName", js.undefined)
    
    inline def setThreatsDetectedItemCount(value: ThreatsDetectedItemCount): Self = StObject.set(x, "ThreatsDetectedItemCount", value.asInstanceOf[js.Any])
    
    inline def setThreatsDetectedItemCountUndefined: Self = StObject.set(x, "ThreatsDetectedItemCount", js.undefined)
  }
}
