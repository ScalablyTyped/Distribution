package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Parameters extends StObject {
  
  /**
    * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
    */
  var ManifestFileLocation: typings.awsSdk.clientsQuicksightMod.ManifestFileLocation
}
object S3Parameters {
  
  inline def apply(ManifestFileLocation: ManifestFileLocation): S3Parameters = {
    val __obj = js.Dynamic.literal(ManifestFileLocation = ManifestFileLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Parameters]
  }
  
  extension [Self <: S3Parameters](x: Self) {
    
    inline def setManifestFileLocation(value: ManifestFileLocation): Self = StObject.set(x, "ManifestFileLocation", value.asInstanceOf[js.Any])
  }
}
