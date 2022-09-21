package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFileConstructor
  extends StObject
     with /**
  * A geoprocessing data object containing a data source.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataFile.html)
  */
Instantiable0[DataFile]
     with Instantiable1[/* properties */ DataFileProperties, DataFile] {
  
  def fromJSON(json: Any): DataFile = js.native
}
