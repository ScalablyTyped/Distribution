package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the best recipe.
    */
  var bestRecipeArn: js.UndefOr[Arn] = js.undefined
}
object AutoMLResult {
  
  inline def apply(): AutoMLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLResult] (val x: Self) extends AnyVal {
    
    inline def setBestRecipeArn(value: Arn): Self = StObject.set(x, "bestRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setBestRecipeArnUndefined: Self = StObject.set(x, "bestRecipeArn", js.undefined)
  }
}
