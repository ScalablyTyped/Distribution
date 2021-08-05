package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingSource extends StObject {
  
  /**
    * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  var detail: js.UndefOr[FindingSourceDetail] = js.undefined
  
  /**
    * Indicates the type of access that generated the finding.
    */
  var `type`: FindingSourceType
}
object FindingSource {
  
  inline def apply(`type`: FindingSourceType): FindingSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSource]
  }
  
  extension [Self <: FindingSource](x: Self) {
    
    inline def setDetail(value: FindingSourceDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: FindingSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
