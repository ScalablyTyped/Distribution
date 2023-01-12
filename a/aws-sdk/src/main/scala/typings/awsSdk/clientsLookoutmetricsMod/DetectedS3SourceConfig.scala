package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedS3SourceConfig extends StObject {
  
  /**
    * The source's file format descriptor.
    */
  var FileFormatDescriptor: js.UndefOr[DetectedFileFormatDescriptor] = js.undefined
}
object DetectedS3SourceConfig {
  
  inline def apply(): DetectedS3SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedS3SourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedS3SourceConfig] (val x: Self) extends AnyVal {
    
    inline def setFileFormatDescriptor(value: DetectedFileFormatDescriptor): Self = StObject.set(x, "FileFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFileFormatDescriptorUndefined: Self = StObject.set(x, "FileFormatDescriptor", js.undefined)
  }
}
