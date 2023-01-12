package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePathMapping extends StObject {
  
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name.
    */
  var basePath: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the associated stage.
    */
  var stage: js.UndefOr[String] = js.undefined
}
object BasePathMapping {
  
  inline def apply(): BasePathMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePathMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePathMapping] (val x: Self) extends AnyVal {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
