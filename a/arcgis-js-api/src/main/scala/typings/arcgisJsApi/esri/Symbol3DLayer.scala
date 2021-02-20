package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`object`
import typings.arcgisJsApi.arcgisJsApiStrings.extrude
import typings.arcgisJsApi.arcgisJsApiStrings.fill
import typings.arcgisJsApi.arcgisJsApiStrings.icon
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.path
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.water
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol3DLayer
  extends Accessor
     with JSONSupport {
  
  /**
    * The 3D symbol layer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: icon | `object` | line | path | fill | water | extrude | text = js.native
}
