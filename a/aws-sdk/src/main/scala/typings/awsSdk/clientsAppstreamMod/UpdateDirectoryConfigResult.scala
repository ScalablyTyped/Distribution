package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectoryConfigResult extends StObject {
  
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.clientsAppstreamMod.DirectoryConfig] = js.undefined
}
object UpdateDirectoryConfigResult {
  
  inline def apply(): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
  
  extension [Self <: UpdateDirectoryConfigResult](x: Self) {
    
    inline def setDirectoryConfig(value: DirectoryConfig): Self = StObject.set(x, "DirectoryConfig", value.asInstanceOf[js.Any])
    
    inline def setDirectoryConfigUndefined: Self = StObject.set(x, "DirectoryConfig", js.undefined)
  }
}
