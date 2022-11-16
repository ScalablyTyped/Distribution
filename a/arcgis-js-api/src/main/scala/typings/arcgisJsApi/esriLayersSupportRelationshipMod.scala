package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RelationshipProperties
import typings.arcgisJsApi.esri.Relationship_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportRelationshipMod {
  
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  /**
    * Describes a [layer's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) relationship with another layer or table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html)
    */
  open class ^ ()
    extends StObject
       with Relationship_ {
    def this(properties: RelationshipProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Relationship_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Relationship_]
}
