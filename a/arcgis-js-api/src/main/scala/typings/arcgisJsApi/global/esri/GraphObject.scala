package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GraphObjectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GraphObject")
@js.native
/**
  * This is the parent class of all objects that can be represented on a graph structure or graph query - [Entity](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html), [Relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html), [Path](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Path.html), and anonymous object.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObject.html)
  */
open class GraphObject ()
  extends StObject
     with typings.arcgisJsApi.esri.GraphObject {
  def this(properties: GraphObjectProperties) = this()
}
