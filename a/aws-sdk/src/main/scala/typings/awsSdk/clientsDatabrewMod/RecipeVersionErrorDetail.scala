package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeVersionErrorDetail extends StObject {
  
  /**
    * The HTTP status code for the error.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ErrorCode] = js.undefined
  
  /**
    * The text of the error message.
    */
  var ErrorMessage: js.UndefOr[RecipeErrorMessage] = js.undefined
  
  /**
    * The identifier for the recipe version associated with this error.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.clientsDatabrewMod.RecipeVersion] = js.undefined
}
object RecipeVersionErrorDetail {
  
  inline def apply(): RecipeVersionErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeVersionErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipeVersionErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: RecipeErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
