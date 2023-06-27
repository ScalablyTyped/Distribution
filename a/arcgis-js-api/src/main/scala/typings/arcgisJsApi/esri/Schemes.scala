package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schemes extends StObject {
  
  /**
  		 * Includes the primary labeling scheme suggested for the input layer's bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#Schemes)
  		 */
  var primaryScheme: Scheme
  
  /**
  		 * Includes secondary labeling schemes suggested for the input layer's bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#Schemes)
  		 */
  var secondarySchemes: js.Array[Scheme]
}
object Schemes {
  
  inline def apply(primaryScheme: Scheme, secondarySchemes: js.Array[Scheme]): Schemes = {
    val __obj = js.Dynamic.literal(primaryScheme = primaryScheme.asInstanceOf[js.Any], secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schemes] (val x: Self) extends AnyVal {
    
    inline def setPrimaryScheme(value: Scheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[Scheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: Scheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value*))
  }
}
