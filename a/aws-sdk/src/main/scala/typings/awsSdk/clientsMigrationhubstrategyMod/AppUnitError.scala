package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUnitError extends StObject {
  
  /**
    * The category of the error.
    */
  var appUnitErrorCategory: js.UndefOr[AppUnitErrorCategory] = js.undefined
}
object AppUnitError {
  
  inline def apply(): AppUnitError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppUnitError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppUnitError] (val x: Self) extends AnyVal {
    
    inline def setAppUnitErrorCategory(value: AppUnitErrorCategory): Self = StObject.set(x, "appUnitErrorCategory", value.asInstanceOf[js.Any])
    
    inline def setAppUnitErrorCategoryUndefined: Self = StObject.set(x, "appUnitErrorCategory", js.undefined)
  }
}
