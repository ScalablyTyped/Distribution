package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def tokenize(
    source: java.lang.String,
    url: java.lang.String,
    getTagDefinition: js.Function1[
      /* tagName */ java.lang.String, 
      atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagDefinition
    ]
  ): TokenizeResult = js.native
  def tokenize(
    source: java.lang.String,
    url: java.lang.String,
    getTagDefinition: js.Function1[
      /* tagName */ java.lang.String, 
      atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagDefinition
    ],
    options: TokenizeOptions
  ): TokenizeResult = js.native
}

