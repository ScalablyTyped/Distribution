package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelationshipQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RelationshipQuery")
@js.native
/**
		 * This class defines parameters for executing queries for related records from a layer.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html)
		 */
open class RelationshipQuery ()
  extends StObject
     with typings.arcgisJsApi.esri.RelationshipQuery {
  def this(properties: RelationshipQueryProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RelationshipQuery {
  
  @JSGlobal("__esri.RelationshipQuery")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelationshipQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelationshipQuery]
}
