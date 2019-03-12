package typings
package antdLib.libGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] {
  var align: /* import warning: ImportType.apply Failed type conversion: ['top', 'middle', 'bottom'][number] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: ['top', 'middle', 'bottom'][number] */ js.Any
  ] = js.undefined
  var gutter: js.UndefOr[scala.Double | (stdLib.Partial[stdLib.Record[Breakpoint, scala.Double]])] = js.undefined
  var justify: /* import warning: ImportType.apply Failed type conversion: ['start', 'end', 'center', 'space-around', 'space-between'][number] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: ['start', 'end', 'center', 'space-around', 'space-between'][number] */ js.Any
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[antdLib.antdLibStrings.flex] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    align: /* import warning: ImportType.apply Failed type conversion: ['top', 'middle', 'bottom'][number] */ js.Any = null,
    gutter: scala.Double | (stdLib.Partial[stdLib.Record[Breakpoint, scala.Double]]) = null,
    justify: /* import warning: ImportType.apply Failed type conversion: ['start', 'end', 'center', 'space-around', 'space-between'][number] */ js.Any = null,
    prefixCls: java.lang.String = null,
    `type`: antdLib.antdLibStrings.flex = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (align != null) __obj.updateDynamic("align")(align)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowProps]
  }
}

