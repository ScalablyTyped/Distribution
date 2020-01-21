package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXCEPINFO extends js.Object {
  val bstrDescription: String
  val bstrHelpFile: String
  val bstrSource: String
  val dwHelpContext: Double
  val pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.undefined
  val pvReserved: js.UndefOr[scala.Nothing] = js.undefined
  val scode: js.Any
  val wCode: Double
  val wReserved: Double
}

object EXCEPINFO {
  @scala.inline
  def apply(
    bstrDescription: String,
    bstrHelpFile: String,
    bstrSource: String,
    dwHelpContext: Double,
    scode: js.Any,
    wCode: Double,
    wReserved: Double,
    pfnDeferredFillIn: js.UndefOr[scala.Nothing] = js.undefined,
    pvReserved: js.UndefOr[scala.Nothing] = js.undefined
  ): EXCEPINFO = {
    val __obj = js.Dynamic.literal(bstrDescription = bstrDescription.asInstanceOf[js.Any], bstrHelpFile = bstrHelpFile.asInstanceOf[js.Any], bstrSource = bstrSource.asInstanceOf[js.Any], dwHelpContext = dwHelpContext.asInstanceOf[js.Any], scode = scode.asInstanceOf[js.Any], wCode = wCode.asInstanceOf[js.Any], wReserved = wReserved.asInstanceOf[js.Any])
    if (!js.isUndefined(pfnDeferredFillIn)) __obj.updateDynamic("pfnDeferredFillIn")(pfnDeferredFillIn.asInstanceOf[js.Any])
    if (!js.isUndefined(pvReserved)) __obj.updateDynamic("pvReserved")(pvReserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXCEPINFO]
  }
}

