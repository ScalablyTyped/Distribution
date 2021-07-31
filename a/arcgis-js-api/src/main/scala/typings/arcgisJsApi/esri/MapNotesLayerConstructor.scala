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
  * The MapNotesLayer is used to create layers based on Map Notes within a WebMap or PortalItem.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html)
  */
Instantiable0[MapNotesLayer]
     with Instantiable1[/* properties */ MapNotesLayerProperties, MapNotesLayer] {
  
  def fromJSON(json: js.Any): MapNotesLayer = js.native
}
