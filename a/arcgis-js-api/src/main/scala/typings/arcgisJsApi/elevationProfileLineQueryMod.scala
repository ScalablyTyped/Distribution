package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationProfileLineQuery
import typings.arcgisJsApi.esri.ElevationProfileLineQueryConstructor
import typings.arcgisJsApi.esri.ElevationProfileLineQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationProfileLineQueryMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileLineQueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineQuery", JSImport.Namespace)
  @js.native
  /**
    * Profile line which samples elevation from a custom elevation source, for example by creating a new [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), or by using an elevation layer from [ground.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfileLineQuery {
    def this(properties: ElevationProfileLineQueryProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileLineQueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationProfileLineQueryMod.foo` */
  override def _to: js.Object & ElevationProfileLineQueryConstructor = ^
}
