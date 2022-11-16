package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Path
import typings.arcgisJsApi.esri.PathProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphPathMod {
  
  @JSImport("esri/rest/knowledgeGraph/Path", JSImport.Namespace)
  @js.native
  /**
    * An object containing all [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) required to traverse a graph from one entity to another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Path.html)
    */
  open class ^ ()
    extends StObject
       with Path {
    def this(properties: PathProperties) = this()
  }
}
