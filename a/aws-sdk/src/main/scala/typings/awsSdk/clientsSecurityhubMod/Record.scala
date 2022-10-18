package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The path, as a JSONPath expression, to the field in the record that contains the data. If the field name is longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
    */
  var JsonPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The record index, starting from 0, for the record that contains the data.
    */
  var RecordIndex: js.UndefOr[Long] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setJsonPath(value: NonEmptyString): Self = StObject.set(x, "JsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "JsonPath", js.undefined)
    
    inline def setRecordIndex(value: Long): Self = StObject.set(x, "RecordIndex", value.asInstanceOf[js.Any])
    
    inline def setRecordIndexUndefined: Self = StObject.set(x, "RecordIndex", js.undefined)
  }
}
