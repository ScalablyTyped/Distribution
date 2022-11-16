package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.EntityTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.EntityType")
@js.native
/**
  * An entity type defines a homogeneous collection of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) with a common set of properties and a spatial feature type.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html)
  */
open class EntityType ()
  extends StObject
     with typings.arcgisJsApi.esri.GraphObjectType {
  def this(properties: EntityTypeProperties) = this()
}
