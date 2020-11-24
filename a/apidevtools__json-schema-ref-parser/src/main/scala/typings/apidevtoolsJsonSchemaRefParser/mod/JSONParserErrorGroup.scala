package typings.apidevtoolsJsonSchemaRefParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apidevtools/json-schema-ref-parser", "JSONParserErrorGroup")
@js.native
class JSONParserErrorGroup () extends Error {
  
  /**
    * List of all errors
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/ref-parser.md#errors
    */
  val errors: js.Array[
    JSONParserError | InvalidPointerError | ResolverError | ParserError | MissingPointerError | UnmatchedParserError | UnmatchedResolverError
  ] = js.native
  
  /**
    * The fields property is a `$RefParser` instance
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html
    */
  val files: RefParser = js.native
}
