package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameDefault extends js.Object {
  var className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var indicator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var size: propDashTypesLib.propDashTypesMod.Requireable[
    antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
  ]
  var spinning: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var wrapperClassName: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_ClassNameDefault {
  @scala.inline
  def apply(
    className: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    indicator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactElementLike],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    size: propDashTypesLib.propDashTypesMod.Requireable[
      antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
    ],
    spinning: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    wrapperClassName: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_ClassNameDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("indicator")(indicator)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("spinning")(spinning)
    __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    __obj.asInstanceOf[Anon_ClassNameDefault]
  }
}

