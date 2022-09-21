package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationProfileLineGround
import typings.arcgisJsApi.esri.ElevationProfileLineGroundConstructor
import typings.arcgisJsApi.esri.ElevationProfileLineGroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationProfileLineGroundMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineGround", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileLineGroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineGround", JSImport.Namespace)
  @js.native
  /**
    * Profile line which samples elevation from the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) of the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) currently set in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineGround.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfileLineGround {
    def this(properties: ElevationProfileLineGroundProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileLineGroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationProfileLineGroundMod.foo` */
  override def _to: js.Object & ElevationProfileLineGroundConstructor = ^
}
