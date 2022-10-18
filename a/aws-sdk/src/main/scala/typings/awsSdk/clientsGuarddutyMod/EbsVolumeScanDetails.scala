package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsVolumeScanDetails extends StObject {
  
  /**
    * Returns the completion date and time of the malware scan.
    */
  var ScanCompletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains a complete view providing malware scan result details.
    */
  var ScanDetections: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ScanDetections] = js.undefined
  
  /**
    * Unique Id of the malware scan that generated the finding.
    */
  var ScanId: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the start date and time of the malware scan.
    */
  var ScanStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains list of threat intelligence sources used to detect threats.
    */
  var Sources: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Sources] = js.undefined
  
  /**
    * GuardDuty finding ID that triggered a malware scan.
    */
  var TriggerFindingId: js.UndefOr[String] = js.undefined
}
object EbsVolumeScanDetails {
  
  inline def apply(): EbsVolumeScanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolumeScanDetails]
  }
  
  extension [Self <: EbsVolumeScanDetails](x: Self) {
    
    inline def setScanCompletedAt(value: js.Date): Self = StObject.set(x, "ScanCompletedAt", value.asInstanceOf[js.Any])
    
    inline def setScanCompletedAtUndefined: Self = StObject.set(x, "ScanCompletedAt", js.undefined)
    
    inline def setScanDetections(value: ScanDetections): Self = StObject.set(x, "ScanDetections", value.asInstanceOf[js.Any])
    
    inline def setScanDetectionsUndefined: Self = StObject.set(x, "ScanDetections", js.undefined)
    
    inline def setScanId(value: String): Self = StObject.set(x, "ScanId", value.asInstanceOf[js.Any])
    
    inline def setScanIdUndefined: Self = StObject.set(x, "ScanId", js.undefined)
    
    inline def setScanStartedAt(value: js.Date): Self = StObject.set(x, "ScanStartedAt", value.asInstanceOf[js.Any])
    
    inline def setScanStartedAtUndefined: Self = StObject.set(x, "ScanStartedAt", js.undefined)
    
    inline def setSources(value: Sources): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTriggerFindingId(value: String): Self = StObject.set(x, "TriggerFindingId", value.asInstanceOf[js.Any])
    
    inline def setTriggerFindingIdUndefined: Self = StObject.set(x, "TriggerFindingId", js.undefined)
  }
}
