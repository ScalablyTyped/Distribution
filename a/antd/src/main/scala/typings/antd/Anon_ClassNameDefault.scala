package typings.antd

import typings.antd.antdStrings.default
import typings.antd.antdStrings.small
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameDefault extends js.Object {
  var className: Requireable[String]
  var prefixCls: Requireable[String]
  var size: Requireable[js.UndefOr[small | default]]
}

object Anon_ClassNameDefault {
  @scala.inline
  def apply(
    className: Requireable[String],
    prefixCls: Requireable[String],
    size: Requireable[js.UndefOr[small | default]]
  ): Anon_ClassNameDefault = {
    val __obj = js.Dynamic.literal(className = className, prefixCls = prefixCls, size = size)
  
    __obj.asInstanceOf[Anon_ClassNameDefault]
  }
}

