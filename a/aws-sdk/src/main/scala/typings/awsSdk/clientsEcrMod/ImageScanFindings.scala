package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFindings extends StObject {
  
  /**
    * Details about the enhanced scan findings from Amazon Inspector.
    */
  var enhancedFindings: js.UndefOr[EnhancedImageScanFindingList] = js.undefined
  
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined
  
  /**
    * The findings from the image scan.
    */
  var findings: js.UndefOr[ImageScanFindingList] = js.undefined
  
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object ImageScanFindings {
  
  inline def apply(): ImageScanFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindings]
  }
  
  extension [Self <: ImageScanFindings](x: Self) {
    
    inline def setEnhancedFindings(value: EnhancedImageScanFindingList): Self = StObject.set(x, "enhancedFindings", value.asInstanceOf[js.Any])
    
    inline def setEnhancedFindingsUndefined: Self = StObject.set(x, "enhancedFindings", js.undefined)
    
    inline def setEnhancedFindingsVarargs(value: EnhancedImageScanFinding*): Self = StObject.set(x, "enhancedFindings", js.Array(value*))
    
    inline def setFindingSeverityCounts(value: FindingSeverityCounts): Self = StObject.set(x, "findingSeverityCounts", value.asInstanceOf[js.Any])
    
    inline def setFindingSeverityCountsUndefined: Self = StObject.set(x, "findingSeverityCounts", js.undefined)
    
    inline def setFindings(value: ImageScanFindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: ImageScanFinding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setImageScanCompletedAt(value: js.Date): Self = StObject.set(x, "imageScanCompletedAt", value.asInstanceOf[js.Any])
    
    inline def setImageScanCompletedAtUndefined: Self = StObject.set(x, "imageScanCompletedAt", js.undefined)
    
    inline def setVulnerabilitySourceUpdatedAt(value: js.Date): Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitySourceUpdatedAtUndefined: Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", js.undefined)
  }
}
