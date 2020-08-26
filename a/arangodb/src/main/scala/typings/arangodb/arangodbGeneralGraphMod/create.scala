package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.anon.GraphkeystringCollectiona
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/general-graph", "_create")
@js.native
object create extends js.Object {
  def apply(name: String): GraphkeystringCollectiona = js.native
  def apply(name: String, edgeDefinitions: js.UndefOr[scala.Nothing], orphanCollections: js.Array[String]): GraphkeystringCollectiona = js.native
  def apply(name: String, edgeDefinitions: js.Array[EdgeDefinition]): GraphkeystringCollectiona = js.native
  def apply(name: String, edgeDefinitions: js.Array[EdgeDefinition], orphanCollections: js.Array[String]): GraphkeystringCollectiona = js.native
}

