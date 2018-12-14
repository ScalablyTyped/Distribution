package typings
package arangodbLib.generalDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/general-graph", JSImport.Namespace)
@js.native
object generalDashGraphModMembers extends js.Object {
  def _create(name: java.lang.String): Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _create(name: java.lang.String, edgeDefinitions: js.Array[EdgeDefinition]): Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _create(
    name: java.lang.String,
    edgeDefinitions: js.Array[EdgeDefinition],
    orphanCollections: js.Array[java.lang.String]
  ): Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _drop(name: java.lang.String): scala.Boolean = js.native
  def _drop(name: java.lang.String, dropCollections: scala.Boolean): scala.Boolean = js.native
  def _edgeDefinitions(relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  def _extendEdgeDefinitions(edgeDefinitions: js.Array[EdgeDefinition], relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  def _graph(name: java.lang.String): Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _list(): js.Array[java.lang.String] = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: java.lang.String,
    toVertexCollections: java.lang.String
  ): EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: java.lang.String,
    toVertexCollections: js.Array[java.lang.String]
  ): EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: js.Array[java.lang.String],
    toVertexCollections: java.lang.String
  ): EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: js.Array[java.lang.String],
    toVertexCollections: js.Array[java.lang.String]
  ): EdgeDefinition = js.native
}

