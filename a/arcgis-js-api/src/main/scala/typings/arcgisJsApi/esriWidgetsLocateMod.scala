package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.Locate
import typings.arcgisJsApi.esri.LocateConstructor
import typings.arcgisJsApi.esri.LocateProperties
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLocateMod extends Shortcut {
  
  @JSImport("esri/widgets/Locate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Locate", JSImport.Namespace)
  @js.native
  /**
    * Provides a simple widget that animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html)
    */
  open class Class ()
    extends StObject
       with Locate {
    def this(properties: LocateProperties) = this()
    
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    override def goToOverride(view: MapView, goToParameters: Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: Any): Unit = js.native
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    @JSName("goToOverride")
    var goToOverride_Original: GoToOverride = js.native
  }
  
  type _To = js.Object & LocateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLocateMod.foo` */
  override def _to: js.Object & LocateConstructor = ^
}
