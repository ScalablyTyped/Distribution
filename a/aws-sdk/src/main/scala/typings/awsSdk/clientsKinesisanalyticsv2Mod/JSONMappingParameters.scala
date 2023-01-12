package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONMappingParameters extends StObject {
  
  /**
    * The path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsSdk.clientsKinesisanalyticsv2Mod.RecordRowPath
}
object JSONMappingParameters {
  
  inline def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONMappingParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONMappingParameters] (val x: Self) extends AnyVal {
    
    inline def setRecordRowPath(value: RecordRowPath): Self = StObject.set(x, "RecordRowPath", value.asInstanceOf[js.Any])
  }
}
