package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RelationshipQuery
import typings.arcgisJsApi.esri.RelationshipQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportRelationshipQueryMod {
  
  @JSImport("esri/rest/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing queries for related records from a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html)
    */
  open class ^ ()
    extends StObject
       with RelationshipQuery {
    def this(properties: RelationshipQueryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RelationshipQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RelationshipQuery]
}
