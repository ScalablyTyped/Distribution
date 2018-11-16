package typings
package atAngularCompilerLib.srcMlUnderscoreParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(getTagDefinition: js.Function1[
      /* tagName */ java.lang.String, 
      atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagDefinition
    ]) = this()
  def getTagDefinition(tagName: java.lang.String): atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagDefinition = js.native
  def parse(source: java.lang.String, url: java.lang.String): ParseTreeResult = js.native
  def parse(source: java.lang.String, url: java.lang.String, parseExpansionForms: scala.Boolean): ParseTreeResult = js.native
  def parse(
    source: java.lang.String,
    url: java.lang.String,
    parseExpansionForms: scala.Boolean,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): ParseTreeResult = js.native
}

