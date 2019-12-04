package typings.atAngularCompiler

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreParserMod.VisitNodeFn
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_parser", JSImport.Namespace)
@js.native
object srcI18nI18nUnderscoreParserMod extends js.Object {
  def createI18nMessageFactory(interpolationConfig: InterpolationConfig): js.Function5[
    /* nodes */ js.Array[Node], 
    /* meaning */ String, 
    /* description */ String, 
    /* id */ String, 
    /* visitNodeFn */ js.UndefOr[VisitNodeFn], 
    Message
  ] = js.native
  type VisitNodeFn = js.Function2[
    /* html */ Node, 
    /* i18n */ typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node, 
    Unit
  ]
}

