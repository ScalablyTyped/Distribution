package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentConstructor
  extends StObject
     with /**
  * The minimum and maximum X and Y coordinates of a bounding box.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html)
  */
Instantiable0[Extent]
     with Instantiable1[/* properties */ ExtentProperties, Extent] {
  
  def fromJSON(json: Any): Extent = js.native
}
