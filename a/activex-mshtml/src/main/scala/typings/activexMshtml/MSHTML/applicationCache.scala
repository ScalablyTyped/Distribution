package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait applicationCache extends js.Object {
  @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache = js.native
  var oncached: js.Any = js.native
  var onchecking: js.Any = js.native
  var ondownloading: js.Any = js.native
  var onerror: js.Any = js.native
  var onnoupdate: js.Any = js.native
  var onobsolete: js.Any = js.native
  var onprogress: js.Any = js.native
  var onupdateready: js.Any = js.native
  val status: Double = js.native
  def abort(): Unit = js.native
  def swapCache(): Unit = js.native
  def update(): Unit = js.native
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
  @scala.inline
  implicit class applicationCacheOps[Self <: applicationCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotapplicationCache_typekey(value: applicationCache): Self = this.set("MSHTML.applicationCache_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setOncached(value: js.Any): Self = this.set("oncached", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnchecking(value: js.Any): Self = this.set("onchecking", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndownloading(value: js.Any): Self = this.set("ondownloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnerror(value: js.Any): Self = this.set("onerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnnoupdate(value: js.Any): Self = this.set("onnoupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnobsolete(value: js.Any): Self = this.set("onobsolete", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnprogress(value: js.Any): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnupdateready(value: js.Any): Self = this.set("onupdateready", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapCache(value: () => Unit): Self = this.set("swapCache", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

