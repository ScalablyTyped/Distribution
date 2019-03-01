package typings
package activexDashStdoleLib.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXCEPINFO extends js.Object {
  val bstrDescription: java.lang.String
  val bstrHelpFile: java.lang.String
  val bstrSource: java.lang.String
  val dwHelpContext: scala.Double
  val pfnDeferredFillIn: js.UndefOr[scala.Nothing]
  val pvReserved: js.UndefOr[scala.Nothing]
  val scode: js.Any
  val wCode: scala.Double
  val wReserved: scala.Double
}

object EXCEPINFO {
  @scala.inline
  def apply(
    bstrDescription: java.lang.String,
    bstrHelpFile: java.lang.String,
    bstrSource: java.lang.String,
    dwHelpContext: scala.Double,
    scode: js.Any,
    wCode: scala.Double,
    wReserved: scala.Double,
    pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.undefined,
    pvReserved: js.UndefOr[scala.Nothing] = js.undefined
  ): EXCEPINFO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bstrDescription")(bstrDescription)
    __obj.updateDynamic("bstrHelpFile")(bstrHelpFile)
    __obj.updateDynamic("bstrSource")(bstrSource)
    __obj.updateDynamic("dwHelpContext")(dwHelpContext)
    __obj.updateDynamic("scode")(scode)
    __obj.updateDynamic("wCode")(wCode)
    __obj.updateDynamic("wReserved")(wReserved)
    if (!js.isUndefined(pfnDeferredFillIn)) __obj.updateDynamic("pfnDeferredFillIn")(pfnDeferredFillIn)
    if (!js.isUndefined(pvReserved)) __obj.updateDynamic("pvReserved")(pvReserved)
    __obj.asInstanceOf[EXCEPINFO]
  }
}

