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
  
  inline def apply(): PartialUpdateObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateObjectsOptions]
  }
  
  extension [Self <: PartialUpdateObjectsOptions](x: Self) {
    
    inline def setCreateIfNotExists(value: Boolean): Self = StObject.set(x, "createIfNotExists", value.asInstanceOf[js.Any])
    
    inline def setCreateIfNotExistsUndefined: Self = StObject.set(x, "createIfNotExists", js.undefined)
  }
}
