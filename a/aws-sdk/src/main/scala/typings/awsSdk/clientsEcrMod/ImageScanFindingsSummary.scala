package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFindingsSummary extends StObject {
  
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined
  
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object ImageScanFindingsSummary {
  
  inline def apply(): ImageScanFindingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindingsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanFindingsSummary] (val x: Self) extends AnyVal {
    
    inline def setFindingSeverityCounts(value: FindingSeverityCounts): Self = StObject.set(x, "findingSeverityCounts", value.asInstanceOf[js.Any])
    
    inline def setFindingSeverityCountsUndefined: Self = StObject.set(x, "findingSeverityCounts", js.undefined)
    
    inline def setImageScanCompletedAt(value: js.Date): Self = StObject.set(x, "imageScanCompletedAt", value.asInstanceOf[js.Any])
    
    inline def setImageScanCompletedAtUndefined: Self = StObject.set(x, "imageScanCompletedAt", js.undefined)
    
    inline def setVulnerabilitySourceUpdatedAt(value: js.Date): Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitySourceUpdatedAtUndefined: Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", js.undefined)
  }
}
