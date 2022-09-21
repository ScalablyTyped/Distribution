package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.slice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceAnalysis
  extends StObject
     with Accessor {
  
  /**
    * The shape used to slice elements in a 3D scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html#shape)
    */
  var shape: SlicePlane = js.native
  
  val `type`: slice = js.native
}
