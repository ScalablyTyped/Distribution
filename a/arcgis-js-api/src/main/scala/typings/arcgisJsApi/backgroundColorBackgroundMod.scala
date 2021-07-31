package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.backgroundColorBackground
import typings.arcgisJsApi.esri.backgroundColorBackgroundConstructor
import typings.arcgisJsApi.esri.backgroundColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundColorBackgroundMod extends Shortcut {
  
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Object & backgroundColorBackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  /**
    * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
    */
  class Class ()
    extends StObject
       with backgroundColorBackground {
    def this(properties: backgroundColorBackgroundProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & backgroundColorBackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `backgroundColorBackgroundMod.foo` */
  override def _to: js.Object & backgroundColorBackgroundConstructor = ^
}
