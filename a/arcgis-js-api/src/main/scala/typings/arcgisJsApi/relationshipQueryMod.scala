package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelationshipQuery
import typings.arcgisJsApi.esri.RelationshipQueryConstructor
import typings.arcgisJsApi.esri.RelationshipQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipQueryMod extends Shortcut {
  
  @JSImport("esri/rest/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RelationshipQueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing queries for related records from a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html)
    */
  open class Class ()
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
  
  type _To = js.Object & RelationshipQueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relationshipQueryMod.foo` */
  override def _to: js.Object & RelationshipQueryConstructor = ^
}
