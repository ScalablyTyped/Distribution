package typings.arangodb.atArangodbGeneralDashGraphMod

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDBNs.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/general-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _create(name: String): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def _create(name: String, edgeDefinitions: js.Array[EdgeDefinition]): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def _create(name: String, edgeDefinitions: js.Array[EdgeDefinition], orphanCollections: js.Array[String]): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def _drop(name: String): Boolean = js.native
  def _drop(name: String, dropCollections: Boolean): Boolean = js.native
  def _edgeDefinitions(relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  def _extendEdgeDefinitions(edgeDefinitions: js.Array[EdgeDefinition], relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  def _graph(name: String): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def _list(): js.Array[String] = js.native
  def _relation(name: String, fromVertexCollections: String, toVertexCollections: String): EdgeDefinition = js.native
  def _relation(name: String, fromVertexCollections: String, toVertexCollections: js.Array[String]): EdgeDefinition = js.native
  def _relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: String): EdgeDefinition = js.native
  def _relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: js.Array[String]): EdgeDefinition = js.native
}

