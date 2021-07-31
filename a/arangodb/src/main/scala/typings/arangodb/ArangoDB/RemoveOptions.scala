package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveOptions extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var returnOld: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object RemoveOptions {
  
  @scala.inline
  def apply(): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOptions]
  }
  
  @scala.inline
  implicit class RemoveOptionsMutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setReturnOld(value: Boolean): Self = StObject.set(x, "returnOld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnOldUndefined: Self = StObject.set(x, "returnOld", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
