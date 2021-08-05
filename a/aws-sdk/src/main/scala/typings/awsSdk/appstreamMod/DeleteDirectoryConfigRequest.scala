package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectoryConfigRequest extends StObject {
  
  /**
    * The name of the directory configuration.
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName
}
object DeleteDirectoryConfigRequest {
  
  inline def apply(DirectoryName: DirectoryName): DeleteDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryConfigRequest]
  }
  
  extension [Self <: DeleteDirectoryConfigRequest](x: Self) {
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
  }
}
