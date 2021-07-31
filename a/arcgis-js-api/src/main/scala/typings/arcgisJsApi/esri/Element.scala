package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element
  extends StObject
     with Accessor
     with JSONSupport
     with ElementMixin {
  
  /**
    * The type of form element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html#type)
    */
  val `type`: field | group = js.native
}
