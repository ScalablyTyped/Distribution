package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import typings.std.RegExp
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
  var searchPattern: RegExp
}
object CoordinateSegment {
  
  @scala.inline
  def apply(
    alias: String,
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    searchPattern: RegExp
  ): CoordinateSegment = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), searchPattern = searchPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSegment]
  }
  
  @scala.inline
  implicit class CoordinateSegmentMutableBuilder[Self <: CoordinateSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPattern(value: RegExp): Self = StObject.set(x, "searchPattern", value.asInstanceOf[js.Any])
  }
}
