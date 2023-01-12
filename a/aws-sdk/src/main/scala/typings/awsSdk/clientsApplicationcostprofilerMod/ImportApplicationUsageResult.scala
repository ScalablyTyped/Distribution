package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportApplicationUsageResult extends StObject {
  
  /**
    * ID of the import request.
    */
  var importId: ImportId
}
object ImportApplicationUsageResult {
  
  inline def apply(importId: ImportId): ImportApplicationUsageResult = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportApplicationUsageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportApplicationUsageResult] (val x: Self) extends AnyVal {
    
    inline def setImportId(value: ImportId): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
  }
}
