package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyObjectCompleteOutput extends StObject {
  
  /**
    * Object checksum
    */
  var ObjectChecksum: String
  
  /**
    * Checksum algorithm
    */
  var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
}
object NotifyObjectCompleteOutput {
  
  inline def apply(ObjectChecksum: String, ObjectChecksumAlgorithm: SummaryChecksumAlgorithm): NotifyObjectCompleteOutput = {
    val __obj = js.Dynamic.literal(ObjectChecksum = ObjectChecksum.asInstanceOf[js.Any], ObjectChecksumAlgorithm = ObjectChecksumAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyObjectCompleteOutput]
  }
  
  extension [Self <: NotifyObjectCompleteOutput](x: Self) {
    
    inline def setObjectChecksum(value: String): Self = StObject.set(x, "ObjectChecksum", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithm(value: SummaryChecksumAlgorithm): Self = StObject.set(x, "ObjectChecksumAlgorithm", value.asInstanceOf[js.Any])
  }
}
