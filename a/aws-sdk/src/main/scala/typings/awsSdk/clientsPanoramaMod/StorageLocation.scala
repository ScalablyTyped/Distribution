package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLocation extends StObject {
  
  /**
    * The location's binary prefix.
    */
  var BinaryPrefixLocation: Object
  
  /**
    * The location's bucket.
    */
  var Bucket: typings.awsSdk.clientsPanoramaMod.Bucket
  
  /**
    * The location's generated prefix.
    */
  var GeneratedPrefixLocation: Object
  
  /**
    * The location's manifest prefix.
    */
  var ManifestPrefixLocation: Object
  
  /**
    * The location's repo prefix.
    */
  var RepoPrefixLocation: Object
}
object StorageLocation {
  
  inline def apply(
    BinaryPrefixLocation: Object,
    Bucket: Bucket,
    GeneratedPrefixLocation: Object,
    ManifestPrefixLocation: Object,
    RepoPrefixLocation: Object
  ): StorageLocation = {
    val __obj = js.Dynamic.literal(BinaryPrefixLocation = BinaryPrefixLocation.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], GeneratedPrefixLocation = GeneratedPrefixLocation.asInstanceOf[js.Any], ManifestPrefixLocation = ManifestPrefixLocation.asInstanceOf[js.Any], RepoPrefixLocation = RepoPrefixLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLocation]
  }
  
  extension [Self <: StorageLocation](x: Self) {
    
    inline def setBinaryPrefixLocation(value: Object): Self = StObject.set(x, "BinaryPrefixLocation", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setGeneratedPrefixLocation(value: Object): Self = StObject.set(x, "GeneratedPrefixLocation", value.asInstanceOf[js.Any])
    
    inline def setManifestPrefixLocation(value: Object): Self = StObject.set(x, "ManifestPrefixLocation", value.asInstanceOf[js.Any])
    
    inline def setRepoPrefixLocation(value: Object): Self = StObject.set(x, "RepoPrefixLocation", value.asInstanceOf[js.Any])
  }
}
