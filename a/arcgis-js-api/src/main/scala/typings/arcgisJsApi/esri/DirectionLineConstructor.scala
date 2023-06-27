package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionLineConstructor
  extends StObject
     with Instantiable0[DirectionLine]
     with Instantiable1[/* properties */ DirectionLineProperties, DirectionLine] {
  
  /**
  		 * Creates a [DirectionLine](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#fromGraphic)
  		 */
  def fromGraphic(): DirectionLine = js.native
  def fromGraphic(graphic: Graphic): DirectionLine = js.native
  
  def fromJSON(json: Any): DirectionLine = js.native
}
