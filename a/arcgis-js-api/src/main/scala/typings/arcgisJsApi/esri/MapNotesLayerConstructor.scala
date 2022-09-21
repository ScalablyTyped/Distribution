package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNotesLayerConstructor
  extends StObject
     with /**
  * The MapNotesLayer lets you display and modify map notes (features sketched on a web map) from the [Map Viewer](https://www.arcgis.com/apps/mapviewer/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html)
  */
Instantiable0[MapNotesLayer]
     with Instantiable1[/* properties */ MapNotesLayerProperties, MapNotesLayer] {
  
  def fromJSON(json: Any): MapNotesLayer = js.native
}
