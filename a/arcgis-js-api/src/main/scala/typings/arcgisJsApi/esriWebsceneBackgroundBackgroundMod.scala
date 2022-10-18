package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Background
import typings.arcgisJsApi.esri.BackgroundConstructor
import typings.arcgisJsApi.esri.BackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneBackgroundBackgroundMod extends Shortcut {
  
  @JSImport("esri/webscene/background/Background", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/background/Background", JSImport.Namespace)
  @js.native
  /**
    * The background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) that lies behind the sky, atmosphere and stars.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html)
    */
  open class Class ()
    extends StObject
       with Background {
    def this(properties: BackgroundProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & BackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebsceneBackgroundBackgroundMod.foo` */
  override def _to: js.Object & BackgroundConstructor = ^
}
