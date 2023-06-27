package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PathProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Path")
@js.native
/**
		 * An object containing all [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) required to traverse a graph from one entity to another.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Path.html)
		 */
open class Path ()
  extends StObject
     with typings.arcgisJsApi.esri.Path {
  def this(properties: PathProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Path {
  
  @JSGlobal("__esri.Path")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Path]
}
