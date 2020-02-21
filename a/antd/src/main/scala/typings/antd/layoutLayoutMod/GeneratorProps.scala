package typings.antd.layoutLayoutMod

import typings.antd.antdStrings.footer
import typings.antd.antdStrings.header
import typings.antd.antdStrings.main
import typings.antd.antdStrings.section
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorProps extends js.Object {
  var displayName: String
  var suffixCls: String
  var tagName: header | footer | main | section
}

object GeneratorProps {
  @scala.inline
  def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneratorProps]
  }
}

