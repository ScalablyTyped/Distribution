package typings.antd.esLayoutLayoutMod

import typings.antd.antdStrings.footer
import typings.antd.antdStrings.header
import typings.antd.antdStrings.main
import typings.antd.antdStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorProps extends js.Object {
  var suffixCls: String
  var tagName: header | footer | main | section
}

object GeneratorProps {
  @scala.inline
  def apply(suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
    val __obj = js.Dynamic.literal(suffixCls = suffixCls, tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratorProps]
  }
}

