package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/", JSImport.Namespace)
@js.native
object Mod extends js.Object {
  val db: arangodbLib.ArangoDBNs.Database with ScalablyTyped.runtime.StringDictionary[js.UndefOr[arangodbLib.ArangoDBNs.Collection[_]]] = js.native
  def aql(strings: stdLib.TemplateStringsArray, args: js.Any*): arangodbLib.ArangoDBNs.Query = js.native
  def query(strings: stdLib.TemplateStringsArray, args: js.Any*): arangodbLib.ArangoDBNs.Cursor[_] = js.native
  def time(): scala.Double = js.native
  @JSName("aql")
  @js.native
  object aqlNs extends js.Object {
    def literal(value: js.Any): arangodbLib.ArangoDBNs.AqlLiteral = js.native
  }
  
}

