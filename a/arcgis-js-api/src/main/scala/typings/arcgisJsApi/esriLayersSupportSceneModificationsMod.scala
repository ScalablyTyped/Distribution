package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.SceneModificationProperties
import typings.arcgisJsApi.esri.SceneModifications
import typings.arcgisJsApi.esri.SceneModificationsConstructor
import typings.arcgisJsApi.esri.SceneModificationsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportSceneModificationsMod extends Shortcut {
  
  @JSImport("esri/layers/support/SceneModifications", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneModificationsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SceneModifications", JSImport.Namespace)
  @js.native
  /**
    * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModifications.html)
    */
  open class Class ()
    extends StObject
       with SceneModifications {
    def this(properties: js.Array[SceneModificationProperties]) = this()
    def this(properties: Collection[SceneModificationProperties]) = this()
    def this(properties: SceneModificationsProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SceneModificationsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportSceneModificationsMod.foo` */
  override def _to: js.Object & SceneModificationsConstructor = ^
}
