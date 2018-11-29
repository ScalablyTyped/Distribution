package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Icu")
@js.native
class Icu protected () extends Node {
  def this(vars: ScalablyTyped.runtime.StringDictionary[BoundText], placeholders: ScalablyTyped.runtime.StringDictionary[Text | BoundText], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(vars: ScalablyTyped.runtime.StringDictionary[BoundText], placeholders: ScalablyTyped.runtime.StringDictionary[Text | BoundText], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(vars: ScalablyTyped.runtime.StringDictionary[BoundText], placeholders: ScalablyTyped.runtime.StringDictionary[Text | BoundText], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  var placeholders: ScalablyTyped.runtime.StringDictionary[Text | BoundText] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var vars: ScalablyTyped.runtime.StringDictionary[BoundText] = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

