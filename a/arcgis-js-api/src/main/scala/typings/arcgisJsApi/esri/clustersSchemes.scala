package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clustersSchemes extends StObject {
  
  /**
  		 * Includes the primary labeling scheme suggested for the input layer's clusters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
  		 */
  var primaryScheme: clustersScheme
  
  /**
  		 * Includes secondary labeling schemes suggested for the input layer's clusters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
  		 */
  var secondarySchemes: js.Array[clustersScheme]
}
object clustersSchemes {
  
  inline def apply(primaryScheme: clustersScheme, secondarySchemes: js.Array[clustersScheme]): clustersSchemes = {
    val __obj = js.Dynamic.literal(primaryScheme = primaryScheme.asInstanceOf[js.Any], secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[clustersSchemes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: clustersSchemes] (val x: Self) extends AnyVal {
    
    inline def setPrimaryScheme(value: clustersScheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[clustersScheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: clustersScheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value*))
  }
}
