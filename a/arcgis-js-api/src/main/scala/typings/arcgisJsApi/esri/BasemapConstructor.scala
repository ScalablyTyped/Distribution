package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapConstructor
  extends StObject
     with /**
  * Creates a new basemap object.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
  */
Instantiable0[Basemap]
     with Instantiable1[/* properties */ BasemapProperties, Basemap] {
  
  /**
    * Creates a new basemap instance from a [well known basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId)
    */
  def fromId(id: String): Basemap = js.native
  
  def fromJSON(json: Any): Basemap = js.native
}
