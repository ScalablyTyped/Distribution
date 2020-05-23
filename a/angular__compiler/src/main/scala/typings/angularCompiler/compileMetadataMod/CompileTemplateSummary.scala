package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.coreMod.ViewEncapsulation
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
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTemplateSummary]
  }
}

