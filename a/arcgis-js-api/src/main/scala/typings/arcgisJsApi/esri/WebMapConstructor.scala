package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMapConstructor
  extends StObject
     with Instantiable0[WebMap]
     with Instantiable1[/* properties */ WebMapProperties, WebMap] {
  
  /**
    * Creates a new instance of this class and initializes it with values from a JSON object generated from an ArcGIS product.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#fromJSON)
    */
  def fromJSON(json: Any): Any = js.native
}
