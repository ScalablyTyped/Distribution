package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/general-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _create(name: java.lang.String): arangodbLib.atArangodbGeneralDashGraphMod.Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _create(
    name: java.lang.String,
    edgeDefinitions: js.Array[arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition]
  ): arangodbLib.atArangodbGeneralDashGraphMod.Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _create(
    name: java.lang.String,
    edgeDefinitions: js.Array[arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition],
    orphanCollections: js.Array[java.lang.String]
  ): arangodbLib.atArangodbGeneralDashGraphMod.Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _drop(name: java.lang.String): scala.Boolean = js.native
  def _drop(name: java.lang.String, dropCollections: scala.Boolean): scala.Boolean = js.native
  def _edgeDefinitions(relations: arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition*): js.Array[arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition] = js.native
  def _extendEdgeDefinitions(
    edgeDefinitions: js.Array[arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition],
    relations: arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition*
  ): js.Array[arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition] = js.native
  def _graph(name: java.lang.String): arangodbLib.atArangodbGeneralDashGraphMod.Graph with org.scalablytyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def _list(): js.Array[java.lang.String] = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: java.lang.String,
    toVertexCollections: java.lang.String
  ): arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: java.lang.String,
    toVertexCollections: js.Array[java.lang.String]
  ): arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: js.Array[java.lang.String],
    toVertexCollections: java.lang.String
  ): arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition = js.native
  def _relation(
    name: java.lang.String,
    fromVertexCollections: js.Array[java.lang.String],
    toVertexCollections: js.Array[java.lang.String]
  ): arangodbLib.atArangodbGeneralDashGraphMod.EdgeDefinition = js.native
}

