package typings
package antdLib.libProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[
    js.Function2[
      /* percent */ js.UndefOr[scala.Double], 
      /* successPercent */ js.UndefOr[scala.Double], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var gapDegree: js.UndefOr[scala.Double] = js.undefined
  var gapPosition: js.UndefOr[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right
  ] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showInfo: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[ProgressSize] = js.undefined
  var status: /* import warning: ImportType.apply Failed type conversion: ['normal', 'exception', 'active', 'success'][number] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: ['normal', 'exception', 'active', 'success'][number] */ js.Any
  ] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeLinecap: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var successPercent: js.UndefOr[scala.Double] = js.undefined
  var trailColor: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ProgressType] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

