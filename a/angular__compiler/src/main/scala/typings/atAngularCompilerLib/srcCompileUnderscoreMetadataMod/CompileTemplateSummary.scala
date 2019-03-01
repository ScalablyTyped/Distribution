package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTemplateSummary extends js.Object {
  var animations: js.Array[_] | scala.Null
  var encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation | scala.Null
  var ngContentSelectors: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
}

object CompileTemplateSummary {
  @scala.inline
  def apply(
    ngContentSelectors: js.Array[java.lang.String],
    styles: js.Array[java.lang.String],
    animations: js.Array[_] = null,
    encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation = null
  ): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngContentSelectors")(ngContentSelectors)
    __obj.updateDynamic("styles")(styles)
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    __obj.asInstanceOf[CompileTemplateSummary]
  }
}

