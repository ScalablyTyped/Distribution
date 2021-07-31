package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialUpdateObjectsOptions extends StObject {
  
  /**
    * If the object should be created when does not exist.
    */
  val createIfNotExists: js.UndefOr[Boolean] = js.undefined
}
object PartialUpdateObjectsOptions {
  
  @scala.inline
  def apply(): PartialUpdateObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateObjectsOptions]
  }
  
  @scala.inline
  implicit class PartialUpdateObjectsOptionsMutableBuilder[Self <: PartialUpdateObjectsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateIfNotExists(value: Boolean): Self = StObject.set(x, "createIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateIfNotExistsUndefined: Self = StObject.set(x, "createIfNotExists", js.undefined)
  }
}
