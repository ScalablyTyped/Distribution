package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceOptions extends InsertOptions {
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var returnOld: js.UndefOr[Boolean] = js.native
}
object ReplaceOptions {
  
  @scala.inline
  def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  @scala.inline
  implicit class ReplaceOptionsMutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setReturnOld(value: Boolean): Self = StObject.set(x, "returnOld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnOldUndefined: Self = StObject.set(x, "returnOld", js.undefined)
  }
}
