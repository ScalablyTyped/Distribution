package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionPointConstructor
  extends StObject
     with /**
  * The DirectionPoint represents direction items as points with various display information.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html)
  */
Instantiable0[DirectionPoint]
     with Instantiable1[/* properties */ DirectionPointProperties, DirectionPoint] {
  
  /**
    * Creates a [DirectionPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#fromGraphic)
    */
  def fromGraphic(): DirectionPoint = js.native
  def fromGraphic(graphic: Graphic): DirectionPoint = js.native
  
  def fromJSON(json: Any): DirectionPoint = js.native
}
