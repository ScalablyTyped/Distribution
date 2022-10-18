package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerAPIMetadataResult extends StObject {
  
  /**
    * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
    */
  var metadata: js.UndefOr[ContainerServiceMetadataEntryList] = js.undefined
}
object GetContainerAPIMetadataResult {
  
  inline def apply(): GetContainerAPIMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerAPIMetadataResult]
  }
  
  extension [Self <: GetContainerAPIMetadataResult](x: Self) {
    
    inline def setMetadata(value: ContainerServiceMetadataEntryList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: ContainerServiceMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value*))
  }
}
