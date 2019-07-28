package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTemplateSummary extends js.Object {
  var animations: js.Array[_] | Null
  var encapsulation: ViewEncapsulation | Null
  var ngContentSelectors: js.Array[String]
  var styles: js.Array[String]
}

object CompileTemplateSummary {
  @scala.inline
  def apply(
    ngContentSelectors: js.Array[String],
    styles: js.Array[String],
    animations: js.Array[_] = null,
    encapsulation: ViewEncapsulation = null
  ): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors, styles = styles)
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    __obj.asInstanceOf[CompileTemplateSummary]
  }
}

