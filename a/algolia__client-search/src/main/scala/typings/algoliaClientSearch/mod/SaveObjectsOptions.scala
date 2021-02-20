package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveObjectsOptions extends StObject {
  
  /**
    * If the object id should be generated when does not exists.
    */
  val autoGenerateObjectIDIfNotExist: js.UndefOr[Boolean] = js.native
}
object SaveObjectsOptions {
  
  @scala.inline
  def apply(): SaveObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveObjectsOptions]
  }
  
  @scala.inline
  implicit class SaveObjectsOptionsMutableBuilder[Self <: SaveObjectsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoGenerateObjectIDIfNotExist(value: Boolean): Self = StObject.set(x, "autoGenerateObjectIDIfNotExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGenerateObjectIDIfNotExistUndefined: Self = StObject.set(x, "autoGenerateObjectIDIfNotExist", js.undefined)
  }
}
