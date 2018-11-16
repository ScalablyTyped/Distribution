package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* dateString */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

