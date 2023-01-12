package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSagemakerServicecatalogPortfolioStatusOutput extends StObject {
  
  /**
    * Whether Service Catalog is enabled or disabled in SageMaker.
    */
  var Status: js.UndefOr[SagemakerServicecatalogStatus] = js.undefined
}
object GetSagemakerServicecatalogPortfolioStatusOutput {
  
  inline def apply(): GetSagemakerServicecatalogPortfolioStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSagemakerServicecatalogPortfolioStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSagemakerServicecatalogPortfolioStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SagemakerServicecatalogStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
