package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationProfileLineView
import typings.arcgisJsApi.esri.ElevationProfileLineViewConstructor
import typings.arcgisJsApi.esri.ElevationProfileLineViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsElevationProfileElevationProfileLineViewMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileLineViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineView", JSImport.Namespace)
  @js.native
  /**
    * Profile line which samples elevation directly from the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfileLineView {
    def this(properties: ElevationProfileLineViewProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileLineViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsElevationProfileElevationProfileLineViewMod.foo` */
  override def _to: js.Object & ElevationProfileLineViewConstructor = ^
}
