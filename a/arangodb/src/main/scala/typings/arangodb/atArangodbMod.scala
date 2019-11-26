package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.AqlLiteral
import typings.arangodb.ArangoDB.Collection
import typings.arangodb.ArangoDB.Cursor
import typings.arangodb.ArangoDB.Database
import typings.arangodb.ArangoDB.Query
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb", JSImport.Namespace)
@js.native
object atArangodbMod extends js.Object {
  val db: Database with StringDictionary[js.UndefOr[Collection[_]]] = js.native
  def query(strings: TemplateStringsArray, args: js.Any*): Cursor[_] = js.native
  def time(): Double = js.native
  @js.native
  object aql extends js.Object {
    def apply(strings: TemplateStringsArray, args: js.Any*): Query = js.native
    def literal(value: js.Any): AqlLiteral = js.native
  }
  
}

