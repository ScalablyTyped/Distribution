package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateSegment
  extends StObject
     with Object {
  
  /**
    * A string that provides the name for this segment of a coordinate string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var alias: String
  
  /**
    * A string that describes the role of this segment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var description: String
  
  /**
    * A regular expression that should extract this segment from the complete coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment)
    */
  var searchPattern: js.RegExp
}
object CoordinateSegment {
  
  inline def apply(
    alias: String,
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    searchPattern: js.RegExp
  ): CoordinateSegment = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), searchPattern = searchPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSegment]
  }
  
  extension [Self <: CoordinateSegment](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setSearchPattern(value: js.RegExp): Self = StObject.set(x, "searchPattern", value.asInstanceOf[js.Any])
  }
}
