package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDBNs.AqlLiteral
import typings.arangodb.ArangoDBNs.Collection
import typings.arangodb.ArangoDBNs.Cursor
import typings.arangodb.ArangoDBNs.Database
import typings.arangodb.ArangoDBNs.Query
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/", JSImport.Namespace)
@js.native
object atArangodbMod extends js.Object {
  val db: Database with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def aql(strings: TemplateStringsArray, args: js.Any*): Query = js.native
  def query(strings: TemplateStringsArray, args: js.Any*): Cursor[_] = js.native
  def time(): Double = js.native
  @JSName("aql")
  @js.native
  object aqlNs extends js.Object {
    def literal(value: js.Any): AqlLiteral = js.native
  }
  
}

