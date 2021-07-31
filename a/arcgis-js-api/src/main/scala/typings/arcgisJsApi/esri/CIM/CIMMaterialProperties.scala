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
  
  @scala.inline
  def apply(): CIMMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMaterialProperties")
    __obj.asInstanceOf[CIMMaterialProperties]
  }
  
  @scala.inline
  implicit class CIMMaterialPropertiesMutableBuilder[Self <: CIMMaterialProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalColorMixMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExternalColorMixMode * / any */ String
    ): Self = StObject.set(x, "externalColorMixMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalColorMixModeUndefined: Self = StObject.set(x, "externalColorMixMode", js.undefined)
    
    @scala.inline
    def setShininess(value: Double): Self = StObject.set(x, "shininess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShininessUndefined: Self = StObject.set(x, "shininess", js.undefined)
    
    @scala.inline
    def setSpecularColor(value: js.Array[Double]): Self = StObject.set(x, "specularColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularColorUndefined: Self = StObject.set(x, "specularColor", js.undefined)
    
    @scala.inline
    def setSpecularColorVarargs(value: Double*): Self = StObject.set(x, "specularColor", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
