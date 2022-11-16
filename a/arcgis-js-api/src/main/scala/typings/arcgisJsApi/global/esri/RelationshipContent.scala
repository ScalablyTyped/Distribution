package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelationshipContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RelationshipContent")
@js.native
/**
  * A `RelationshipContent` popup element represents a relationship element associated with a feature.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-RelationshipContent.html)
  */
open class RelationshipContent ()
  extends StObject
     with typings.arcgisJsApi.esri.RelationshipContent {
  def this(properties: RelationshipContentProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RelationshipContent {
  
  @JSGlobal("__esri.RelationshipContent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelationshipContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelationshipContent]
}
