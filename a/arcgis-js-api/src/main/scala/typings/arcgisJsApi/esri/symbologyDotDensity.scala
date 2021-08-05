package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing helper methods for getting optimal symbol schemes used to create [dot density visualizations](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html)
  */
trait symbologyDotDensity extends StObject {
  
  /**
    * Clones a dot density scheme object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#cloneScheme)
    */
  def cloneScheme(scheme: DotDensityScheme): DotDensityScheme
  
  /**
    * Returns a dot density scheme with the provided name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  def getSchemeByName(params: dotDensityGetSchemeByNameParams): DotDensityScheme
  
  /**
    * Returns a primary scheme and secondary schemes defining symbol properties for dot density-based data-driven visualizations in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  def getSchemes(params: dotDensityGetSchemesParams): DotDensitySchemes
  
  /**
    * Returns an array of dot density schemes with the provided tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  def getSchemesByTag(params: dotDensityGetSchemesByTagParams): js.Array[DotDensityScheme]
}
object symbologyDotDensity {
  
  inline def apply(
    cloneScheme: DotDensityScheme => DotDensityScheme,
    getSchemeByName: dotDensityGetSchemeByNameParams => DotDensityScheme,
    getSchemes: dotDensityGetSchemesParams => DotDensitySchemes,
    getSchemesByTag: dotDensityGetSchemesByTagParams => js.Array[DotDensityScheme]
  ): symbologyDotDensity = {
    val __obj = js.Dynamic.literal(cloneScheme = js.Any.fromFunction1(cloneScheme), getSchemeByName = js.Any.fromFunction1(getSchemeByName), getSchemes = js.Any.fromFunction1(getSchemes), getSchemesByTag = js.Any.fromFunction1(getSchemesByTag))
    __obj.asInstanceOf[symbologyDotDensity]
  }
  
  extension [Self <: symbologyDotDensity](x: Self) {
    
    inline def setCloneScheme(value: DotDensityScheme => DotDensityScheme): Self = StObject.set(x, "cloneScheme", js.Any.fromFunction1(value))
    
    inline def setGetSchemeByName(value: dotDensityGetSchemeByNameParams => DotDensityScheme): Self = StObject.set(x, "getSchemeByName", js.Any.fromFunction1(value))
    
    inline def setGetSchemes(value: dotDensityGetSchemesParams => DotDensitySchemes): Self = StObject.set(x, "getSchemes", js.Any.fromFunction1(value))
    
    inline def setGetSchemesByTag(value: dotDensityGetSchemesByTagParams => js.Array[DotDensityScheme]): Self = StObject.set(x, "getSchemesByTag", js.Any.fromFunction1(value))
  }
}
