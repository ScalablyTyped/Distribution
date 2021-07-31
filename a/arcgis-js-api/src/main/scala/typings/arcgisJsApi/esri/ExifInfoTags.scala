package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExifInfoTags
  extends StObject
     with Object {
  
  /**
    * The tag description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var description: String
  
  /**
    * The tag name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var name: String
  
  /**
    * The value of the tag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo)
    */
  var value: js.Any
}
object ExifInfoTags {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: js.Any
  ): ExifInfoTags = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifInfoTags]
  }
  
  @scala.inline
  implicit class ExifInfoTagsMutableBuilder[Self <: ExifInfoTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
