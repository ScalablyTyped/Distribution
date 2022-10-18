package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemsResponse extends StObject {
  
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined
  
  /**
    * Present if provided by caller in the request (String).
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEfsMod.Marker] = js.undefined
  
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextMarker in the subsequent request to fetch the descriptions.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeFileSystemsResponse {
  
  inline def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  
  extension [Self <: DescribeFileSystemsResponse](x: Self) {
    
    inline def setFileSystems(value: FileSystemDescriptions): Self = StObject.set(x, "FileSystems", value.asInstanceOf[js.Any])
    
    inline def setFileSystemsUndefined: Self = StObject.set(x, "FileSystems", js.undefined)
    
    inline def setFileSystemsVarargs(value: FileSystemDescription*): Self = StObject.set(x, "FileSystems", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
