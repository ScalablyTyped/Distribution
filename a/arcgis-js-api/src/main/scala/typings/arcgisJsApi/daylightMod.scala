package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Daylight
import typings.arcgisJsApi.esri.DaylightConstructor
import typings.arcgisJsApi.esri.DaylightProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daylightMod extends Shortcut {
  
  @JSImport("esri/widgets/Daylight", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DaylightConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Daylight", JSImport.Namespace)
  @js.native
  /**
    * The Daylight widget can be used to manipulate the lighting conditions of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html)
    */
  open class Class ()
    extends StObject
       with Daylight {
    def this(properties: DaylightProperties) = this()
  }
  
  type _To = js.Object & DaylightConstructor
  
  /* This means you don't have to write `^`, but can instead just say `daylightMod.foo` */
  override def _to: js.Object & DaylightConstructor = ^
}
