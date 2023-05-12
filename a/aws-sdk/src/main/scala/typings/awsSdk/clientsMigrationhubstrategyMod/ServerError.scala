package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerError extends StObject {
  
  /**
    * The error category of server analysis.
    */
  var serverErrorCategory: js.UndefOr[ServerErrorCategory] = js.undefined
}
object ServerError {
  
  inline def apply(): ServerError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerError] (val x: Self) extends AnyVal {
    
    inline def setServerErrorCategory(value: ServerErrorCategory): Self = StObject.set(x, "serverErrorCategory", value.asInstanceOf[js.Any])
    
    inline def setServerErrorCategoryUndefined: Self = StObject.set(x, "serverErrorCategory", js.undefined)
  }
}
