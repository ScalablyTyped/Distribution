package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAllObjectsOptions extends StObject {
  
  /**
    * If the all objects should be replaced using wait operations. Keep
    * in mind that, when the `safe` option is used, the operation may
    * take a little more than expected.
    */
  val safe: js.UndefOr[Boolean] = js.undefined
}
object ReplaceAllObjectsOptions {
  
  inline def apply(): ReplaceAllObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllObjectsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceAllObjectsOptions] (val x: Self) extends AnyVal {
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
