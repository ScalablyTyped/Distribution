package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingParameters extends StObject {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.CSVMappingParameters] = js.undefined
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.JSONMappingParameters] = js.undefined
}
object MappingParameters {
  
  inline def apply(): MappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingParameters] (val x: Self) extends AnyVal {
    
    inline def setCSVMappingParameters(value: CSVMappingParameters): Self = StObject.set(x, "CSVMappingParameters", value.asInstanceOf[js.Any])
    
    inline def setCSVMappingParametersUndefined: Self = StObject.set(x, "CSVMappingParameters", js.undefined)
    
    inline def setJSONMappingParameters(value: JSONMappingParameters): Self = StObject.set(x, "JSONMappingParameters", value.asInstanceOf[js.Any])
    
    inline def setJSONMappingParametersUndefined: Self = StObject.set(x, "JSONMappingParameters", js.undefined)
  }
}
