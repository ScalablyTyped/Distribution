package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SceneModificationProperties
import typings.arcgisJsApi.esri.SceneModificationsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SceneModifications")
@js.native
/**
  * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModifications.html)
  */
open class SceneModifications ()
  extends StObject
     with typings.arcgisJsApi.esri.SceneModifications {
  def this(properties: js.Array[SceneModificationProperties]) = this()
  def this(properties: typings.arcgisJsApi.esri.Collection[SceneModificationProperties]) = this()
  def this(properties: SceneModificationsProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SceneModifications {
  
  @JSGlobal("__esri.SceneModifications")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SceneModifications = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SceneModifications]
}
