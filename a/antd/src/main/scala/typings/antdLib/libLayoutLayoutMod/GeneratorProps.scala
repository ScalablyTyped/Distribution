package typings
package antdLib.libLayoutLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorProps extends js.Object {
  var suffixCls: java.lang.String
  var tagName: antdLib.antdLibStrings.header | antdLib.antdLibStrings.footer | antdLib.antdLibStrings.main | antdLib.antdLibStrings.section
}

object GeneratorProps {
  @scala.inline
  def apply(
    suffixCls: java.lang.String,
    tagName: antdLib.antdLibStrings.header | antdLib.antdLibStrings.footer | antdLib.antdLibStrings.main | antdLib.antdLibStrings.section
  ): GeneratorProps = {
    val __obj = js.Dynamic.literal(suffixCls = suffixCls, tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratorProps]
  }
}

