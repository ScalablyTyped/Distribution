package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeotriggerConstructor
  extends StObject
     with /**
  * A Geotrigger is a condition that will be monitored against dynamic GIS data - for example using a spatial operation to check for enter/exit.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-Geotrigger.html)
  */
Instantiable0[Geotrigger]
     with Instantiable1[/* properties */ GeotriggerProperties, Geotrigger] {
  
  def fromJSON(json: Any): Geotrigger = js.native
}
