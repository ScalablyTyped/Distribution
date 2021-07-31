package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerConstructor
  extends StObject
     with /**
  * The CSVLayer is a point layer based on a CSV file (.csv, .txt).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html)
  */
Instantiable0[CSVLayer]
     with Instantiable1[/* properties */ CSVLayerProperties, CSVLayer] {
  
  def fromJSON(json: js.Any): CSVLayer = js.native
}
