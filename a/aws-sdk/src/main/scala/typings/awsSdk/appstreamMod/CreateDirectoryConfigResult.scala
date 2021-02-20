package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectoryConfigResult extends StObject {
  
  /**
    * Information about the directory configuration.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryConfig] = js.native
}
object CreateDirectoryConfigResult {
  
  @scala.inline
  def apply(): CreateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectoryConfigResult]
  }
  
  @scala.inline
  implicit class CreateDirectoryConfigResultMutableBuilder[Self <: CreateDirectoryConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryConfig(value: DirectoryConfig): Self = StObject.set(x, "DirectoryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryConfigUndefined: Self = StObject.set(x, "DirectoryConfig", js.undefined)
  }
}
