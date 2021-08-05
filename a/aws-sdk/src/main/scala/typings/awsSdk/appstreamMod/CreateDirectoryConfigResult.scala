package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryConfigResult extends StObject {
  
  /**
    * Information about the directory configuration.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryConfig] = js.undefined
}
object CreateDirectoryConfigResult {
  
  inline def apply(): CreateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectoryConfigResult]
  }
  
  extension [Self <: CreateDirectoryConfigResult](x: Self) {
    
    inline def setDirectoryConfig(value: DirectoryConfig): Self = StObject.set(x, "DirectoryConfig", value.asInstanceOf[js.Any])
    
    inline def setDirectoryConfigUndefined: Self = StObject.set(x, "DirectoryConfig", js.undefined)
  }
}
