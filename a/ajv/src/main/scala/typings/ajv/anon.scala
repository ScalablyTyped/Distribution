package typings.ajv

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`true`
import typings.ajv.mod.AjvErrors.MissingRefError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Copy extends js.Object {
    def copy(obj: js.Any): js.Any = js.native
    def copy(obj: js.Any, target: js.Any): js.Any = js.native
    def equal(obj: js.Any, target: js.Any): Boolean = js.native
    def escapeFragment(str: String): String = js.native
    def escapeJsonPointer(str: String): String = js.native
    def escapeQuotes(str: String): String = js.native
    def getData(jsonPointer: String, dataLevel: Double, paths: js.Array[String]): String = js.native
    def getProperty(str: String): String = js.native
    def schemaHasRules(schema: js.Object, rules: js.Any): String = js.native
    def toHash(source: js.Array[String]): StringDictionary[js.UndefOr[`true`]] = js.native
    def toQuotedString(str: String): String = js.native
    def unescapeFragment(str: String): String = js.native
    def unescapeJsonPointer(str: String): String = js.native
  }
  
  @js.native
  trait TypeofMissingRefError
    extends Instantiable2[/* baseId */ String, /* ref */ String, MissingRefError]
       with Instantiable3[/* baseId */ String, /* ref */ String, /* message */ String, MissingRefError] {
    def message(baseId: String, ref: String): String = js.native
  }
  
}

