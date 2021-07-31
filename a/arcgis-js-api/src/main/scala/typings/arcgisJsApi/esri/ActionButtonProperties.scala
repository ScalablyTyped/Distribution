package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionButtonProperties
  extends StObject
     with ActionBaseProperties {
  
  /**
    * The URL to an image that will be used to represent the action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: js.UndefOr[String] = js.undefined
}
object ActionButtonProperties {
  
  @scala.inline
  def apply(): ActionButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionButtonProperties]
  }
  
  @scala.inline
  implicit class ActionButtonPropertiesMutableBuilder[Self <: ActionButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
