package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.dash
import typings.arcgisJsApi.arcgisJsApiStrings.dot
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineStylePattern3D
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The pattern style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html#style)
    */
  var style: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid = js.native
  
  /**
    * The pattern type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html#type)
    */
  val `type`: style = js.native
}
