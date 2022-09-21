package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationProfile
import typings.arcgisJsApi.esri.ElevationProfileConstructor
import typings.arcgisJsApi.esri.ElevationProfileProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationProfileMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile", JSImport.Namespace)
  @js.native
  /**
    * The ElevationProfile widget is used to generate and display an elevation profile from an [input line graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfile {
    def this(properties: ElevationProfileProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationProfileMod.foo` */
  override def _to: js.Object & ElevationProfileConstructor = ^
}
