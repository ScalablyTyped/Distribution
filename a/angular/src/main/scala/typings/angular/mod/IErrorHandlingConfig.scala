package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorHandlingConfig extends StObject {
  
  /**
    * The max depth for stringifying objects.
    * Setting to a non-positive or non-numeric value, removes the max depth limit
    * @default 5
    */
  var objectMaxDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the generated error url will contain the parameters of the thrown error.
    * Disabling the parameters can be useful if the generated error url is very long.
    * @default true;
    */
  var urlErrorParamsEnabled: js.UndefOr[Boolean] = js.undefined
}
object IErrorHandlingConfig {
  
  inline def apply(): IErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorHandlingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IErrorHandlingConfig] (val x: Self) extends AnyVal {
    
    inline def setObjectMaxDepth(value: Double): Self = StObject.set(x, "objectMaxDepth", value.asInstanceOf[js.Any])
    
    inline def setObjectMaxDepthUndefined: Self = StObject.set(x, "objectMaxDepth", js.undefined)
    
    inline def setUrlErrorParamsEnabled(value: Boolean): Self = StObject.set(x, "urlErrorParamsEnabled", value.asInstanceOf[js.Any])
    
    inline def setUrlErrorParamsEnabledUndefined: Self = StObject.set(x, "urlErrorParamsEnabled", js.undefined)
  }
}
