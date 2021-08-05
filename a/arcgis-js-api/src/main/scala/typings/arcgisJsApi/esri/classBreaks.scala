package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating class breaks for an input field in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html)
  */
trait classBreaks extends StObject {
  
  /**
    * Generates class breaks for an input field (or expression) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  def classBreaks(params: classBreaksClassBreaksParams): js.Promise[ClassBreaksResult]
}
object classBreaks {
  
  inline def apply(classBreaks: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): classBreaks = {
    val __obj = js.Dynamic.literal(classBreaks = js.Any.fromFunction1(classBreaks))
    __obj.asInstanceOf[classBreaks]
  }
  
  extension [Self <: classBreaks](x: Self) {
    
    inline def setClassBreaks(value: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): Self = StObject.set(x, "classBreaks", js.Any.fromFunction1(value))
  }
}
