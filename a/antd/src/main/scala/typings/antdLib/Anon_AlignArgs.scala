package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignArgs extends js.Object {
  var align: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var cancelText: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var centered: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var closable: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var confirmLoading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var footer: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var okText: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var onCancel: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var onOk: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var title: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var visible: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var width: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | scala.Double]
}

object Anon_AlignArgs {
  @scala.inline
  def apply(
    align: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    cancelText: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    centered: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    closable: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    confirmLoading: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    footer: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    okText: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    onCancel: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    onOk: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    title: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    visible: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    width: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | scala.Double]
  ): Anon_AlignArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("cancelText")(cancelText)
    __obj.updateDynamic("centered")(centered)
    __obj.updateDynamic("closable")(closable)
    __obj.updateDynamic("confirmLoading")(confirmLoading)
    __obj.updateDynamic("footer")(footer)
    __obj.updateDynamic("okText")(okText)
    __obj.updateDynamic("onCancel")(onCancel)
    __obj.updateDynamic("onOk")(onOk)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_AlignArgs]
  }
}

