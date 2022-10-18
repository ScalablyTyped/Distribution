package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
  
  /**
    * Represents a list of URIs of a location. LocationUri returns an array that contains a list of locations when the ListLocations operation is called. Format: TYPE://GLOBAL_ID/SUBDIR. TYPE designates the type of location (for example, nfs or s3). GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is us-east-2.fs-abcd1234. An example for Amazon S3 is the bucket name, such as myBucket. An example for NFS is a valid IPv4 address or a hostname that is compliant with Domain Name Service (DNS). SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat as the root of the location. 
    */
  var LocationUri: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationUri] = js.undefined
}
object LocationListEntry {
  
  inline def apply(): LocationListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationListEntry]
  }
  
  extension [Self <: LocationListEntry](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
  }
}
