package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineCallout3D extends Callout3D {
  
  /**
    * The border settings of the callout line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: LineCallout3DBorder = js.native
  
  /**
    * The color of the callout line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * The width of the callout line in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    */
  var size: Double = js.native
  
  var `type`: line = js.native
}
