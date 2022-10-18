package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobRequest extends StObject {
  
  /**
    * The data source for the import job.
    */
  var ImportDataSource: typings.awsSdk.clientsSesv2Mod.ImportDataSource
  
  /**
    * The destination for the import job.
    */
  var ImportDestination: typings.awsSdk.clientsSesv2Mod.ImportDestination
}
object CreateImportJobRequest {
  
  inline def apply(ImportDataSource: ImportDataSource, ImportDestination: ImportDestination): CreateImportJobRequest = {
    val __obj = js.Dynamic.literal(ImportDataSource = ImportDataSource.asInstanceOf[js.Any], ImportDestination = ImportDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobRequest]
  }
  
  extension [Self <: CreateImportJobRequest](x: Self) {
    
    inline def setImportDataSource(value: ImportDataSource): Self = StObject.set(x, "ImportDataSource", value.asInstanceOf[js.Any])
    
    inline def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
  }
}
