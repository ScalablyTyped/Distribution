package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMaterialProperties extends StObject {
  
  /**
  			 * How this material combines with externally defined colors.
  			 */
  var externalColorMixMode: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExternalColorMixMode * / any */ String
  ] = js.undefined
  
  /**
  			 * The shininess.
  			 */
  var shininess: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The specular color.
  			 */
  var specularColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties
}
object CIMMaterialProperties {
  
  inline def apply(): CIMMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMaterialProperties")
    __obj.asInstanceOf[CIMMaterialProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMaterialProperties] (val x: Self) extends AnyVal {
    
    inline def setExternalColorMixMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExternalColorMixMode * / any */ String
    ): Self = StObject.set(x, "externalColorMixMode", value.asInstanceOf[js.Any])
    
    inline def setExternalColorMixModeUndefined: Self = StObject.set(x, "externalColorMixMode", js.undefined)
    
    inline def setShininess(value: Double): Self = StObject.set(x, "shininess", value.asInstanceOf[js.Any])
    
    inline def setShininessUndefined: Self = StObject.set(x, "shininess", js.undefined)
    
    inline def setSpecularColor(value: js.Array[Double]): Self = StObject.set(x, "specularColor", value.asInstanceOf[js.Any])
    
    inline def setSpecularColorUndefined: Self = StObject.set(x, "specularColor", js.undefined)
    
    inline def setSpecularColorVarargs(value: Double*): Self = StObject.set(x, "specularColor", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
