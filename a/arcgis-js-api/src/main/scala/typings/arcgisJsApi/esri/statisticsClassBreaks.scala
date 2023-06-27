package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Function for generating class breaks for an input field in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html)
	 */
trait statisticsClassBreaks extends StObject {
  
  /**
  		 * Generates class breaks for an input field (or expression) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
  		 */
  def classBreaks(params: classBreaksClassBreaksParams): js.Promise[ClassBreaksResult]
}
object statisticsClassBreaks {
  
  inline def apply(classBreaks: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): statisticsClassBreaks = {
    val __obj = js.Dynamic.literal(classBreaks = js.Any.fromFunction1(classBreaks))
    __obj.asInstanceOf[statisticsClassBreaks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: statisticsClassBreaks] (val x: Self) extends AnyVal {
    
    inline def setClassBreaks(value: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): Self = StObject.set(x, "classBreaks", js.Any.fromFunction1(value))
  }
}
