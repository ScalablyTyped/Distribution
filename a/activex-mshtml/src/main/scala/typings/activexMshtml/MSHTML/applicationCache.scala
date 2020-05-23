package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait applicationCache extends js.Object {
  @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache
  var oncached: js.Any
  var onchecking: js.Any
  var ondownloading: js.Any
  var onerror: js.Any
  var onnoupdate: js.Any
  var onobsolete: js.Any
  var onprogress: js.Any
  var onupdateready: js.Any
  val status: Double
  def abort(): Unit
  def swapCache(): Unit
  def update(): Unit
}

object applicationCache {
  @scala.inline
  def apply(
    MSHTMLDotapplicationCache_typekey: applicationCache,
    abort: () => Unit,
    oncached: js.Any,
    onchecking: js.Any,
    ondownloading: js.Any,
    onerror: js.Any,
    onnoupdate: js.Any,
    onobsolete: js.Any,
    onprogress: js.Any,
    onupdateready: js.Any,
    status: Double,
    swapCache: () => Unit,
    update: () => Unit
  ): applicationCache = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), oncached = oncached.asInstanceOf[js.Any], onchecking = onchecking.asInstanceOf[js.Any], ondownloading = ondownloading.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onnoupdate = onnoupdate.asInstanceOf[js.Any], onobsolete = onobsolete.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onupdateready = onupdateready.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], swapCache = js.Any.fromFunction0(swapCache), update = js.Any.fromFunction0(update))
    __obj.updateDynamic("MSHTML.applicationCache_typekey")(MSHTMLDotapplicationCache_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[applicationCache]
  }
}

