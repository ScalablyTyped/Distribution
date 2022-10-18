package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetImportSummary extends StObject {
  
  /**
    * The number of data set imports that have failed.
    */
  var failed: Integer
  
  /**
    * The number of data set imports that are in progress.
    */
  var inProgress: Integer
  
  /**
    * The number of data set imports that are pending.
    */
  var pending: Integer
  
  /**
    * The number of data set imports that have succeeded.
    */
  var succeeded: Integer
  
  /**
    * The total number of data set imports.
    */
  var total: Integer
}
object DataSetImportSummary {
  
  inline def apply(failed: Integer, inProgress: Integer, pending: Integer, succeeded: Integer, total: Integer): DataSetImportSummary = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetImportSummary]
  }
  
  extension [Self <: DataSetImportSummary](x: Self) {
    
    inline def setFailed(value: Integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: Integer): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Integer): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Integer): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
