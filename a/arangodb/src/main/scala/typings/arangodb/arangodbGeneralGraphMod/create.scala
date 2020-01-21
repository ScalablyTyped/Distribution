package typings.arangodb.arangodbGeneralGraphMod

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/general-graph", "_create")
@js.native
object create extends js.Object {
  def apply(name: String): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def apply(name: String, edgeDefinitions: js.Array[EdgeDefinition]): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def apply(name: String, edgeDefinitions: js.Array[EdgeDefinition], orphanCollections: js.Array[String]): Graph with StringDictionary[js.UndefOr[Collection[_]]] = js.native
}

