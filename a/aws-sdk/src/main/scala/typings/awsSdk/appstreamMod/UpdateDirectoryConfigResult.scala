package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDirectoryConfigResult extends StObject {
  
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryConfig] = js.native
}
object UpdateDirectoryConfigResult {
  
  @scala.inline
  def apply(): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
  
  @scala.inline
  implicit class UpdateDirectoryConfigResultMutableBuilder[Self <: UpdateDirectoryConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryConfig(value: DirectoryConfig): Self = StObject.set(x, "DirectoryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryConfigUndefined: Self = StObject.set(x, "DirectoryConfig", js.undefined)
  }
}
