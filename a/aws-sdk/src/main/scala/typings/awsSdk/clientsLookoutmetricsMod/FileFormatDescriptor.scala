package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFormatDescriptor extends StObject {
  
  /**
    * Contains information about how a source CSV data file should be analyzed.
    */
  var CsvFormatDescriptor: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.CsvFormatDescriptor] = js.undefined
  
  /**
    * Contains information about how a source JSON data file should be analyzed.
    */
  var JsonFormatDescriptor: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.JsonFormatDescriptor] = js.undefined
}
object FileFormatDescriptor {
  
  inline def apply(): FileFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileFormatDescriptor]
  }
  
  extension [Self <: FileFormatDescriptor](x: Self) {
    
    inline def setCsvFormatDescriptor(value: CsvFormatDescriptor): Self = StObject.set(x, "CsvFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setCsvFormatDescriptorUndefined: Self = StObject.set(x, "CsvFormatDescriptor", js.undefined)
    
    inline def setJsonFormatDescriptor(value: JsonFormatDescriptor): Self = StObject.set(x, "JsonFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setJsonFormatDescriptorUndefined: Self = StObject.set(x, "JsonFormatDescriptor", js.undefined)
  }
}
