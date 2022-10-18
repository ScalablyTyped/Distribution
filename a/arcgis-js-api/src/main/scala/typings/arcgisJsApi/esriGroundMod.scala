package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Ground
import typings.arcgisJsApi.esri.GroundConstructor
import typings.arcgisJsApi.esri.GroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGroundMod extends Shortcut {
  
  @JSImport("esri/Ground", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Ground", JSImport.Namespace)
  @js.native
  /**
    * The Ground class contains properties that specify how the ground surface is displayed in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html)
    */
  open class Class ()
    extends StObject
       with Ground {
    def this(properties: GroundProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGroundMod.foo` */
  override def _to: js.Object & GroundConstructor = ^
}
