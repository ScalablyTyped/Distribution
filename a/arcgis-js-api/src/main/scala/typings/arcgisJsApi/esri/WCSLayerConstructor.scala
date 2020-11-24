package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WCSLayerConstructor
  extends /**
  * WCS presents raster data from a [OGC Web Coverage Service](https://www.ogc.org/standards/wcs).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html)
  */
Instantiable0[WCSLayer]
     with Instantiable1[/* properties */ WCSLayerProperties, WCSLayer] {
  
  def fromJSON(json: js.Any): WCSLayer = js.native
}
