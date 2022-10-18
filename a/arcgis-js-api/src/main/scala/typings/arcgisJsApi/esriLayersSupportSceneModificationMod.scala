package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneModification
import typings.arcgisJsApi.esri.SceneModificationConstructor
import typings.arcgisJsApi.esri.SceneModificationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportSceneModificationMod extends Shortcut {
  
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneModificationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  /**
    * The SceneModification is used to perform a client-side geometric modifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html)
    */
  open class Class ()
    extends StObject
       with SceneModification {
    def this(properties: SceneModificationProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SceneModificationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportSceneModificationMod.foo` */
  override def _to: js.Object & SceneModificationConstructor = ^
}
