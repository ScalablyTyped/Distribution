package typings.arcgisJsApi.esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditingInfo extends Object {
  
  /**
    * Indicates the last time the layer was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditingInfo)
    */
  var lastEditDate: Date = js.native
}
object EditingInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    lastEditDate: Date,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EditingInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lastEditDate = lastEditDate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EditingInfo]
  }
  
  @scala.inline
  implicit class EditingInfoMutableBuilder[Self <: EditingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastEditDate(value: Date): Self = StObject.set(x, "lastEditDate", value.asInstanceOf[js.Any])
  }
}
