package typings.antd

import typings.antd.libStatisticUtilsMod._Formatter
import typings.antd.libTreeDirectoryTreeMod.ExpandAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antdBooleans {
  @js.native
  sealed trait `false`
    extends ExpandAction
       with _Formatter
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

