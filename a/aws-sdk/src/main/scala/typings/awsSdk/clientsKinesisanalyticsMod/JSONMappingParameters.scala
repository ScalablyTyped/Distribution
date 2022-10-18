package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONMappingParameters extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsSdk.clientsKinesisanalyticsMod.RecordRowPath
}
object JSONMappingParameters {
  
  inline def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONMappingParameters]
  }
  
  extension [Self <: JSONMappingParameters](x: Self) {
    
    inline def setRecordRowPath(value: RecordRowPath): Self = StObject.set(x, "RecordRowPath", value.asInstanceOf[js.Any])
  }
}
