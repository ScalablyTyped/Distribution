package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schemes
  extends StObject
     with Object {
  
  /**
    * Includes the primary labeling scheme suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var primaryScheme: Scheme
  
  /**
    * Includes secondary labeling schemes suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var secondarySchemes: js.Array[Scheme]
}
object Schemes {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: Scheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[Scheme]
  ): Schemes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemes]
  }
  
  extension [Self <: Schemes](x: Self) {
    
    inline def setPrimaryScheme(value: Scheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemes(value: js.Array[Scheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecondarySchemesVarargs(value: Scheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value :_*))
  }
}
