package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait applicationCache extends StObject {
  
  @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache = js.native
  
  def abort(): Unit = js.native
  
  var oncached: js.Any = js.native
  
  var onchecking: js.Any = js.native
  
  var ondownloading: js.Any = js.native
  
  var onerror: js.Any = js.native
  
  var onnoupdate: js.Any = js.native
  
  var onobsolete: js.Any = js.native
  
  var onprogress: js.Any = js.native
  
  var onupdateready: js.Any = js.native
  
  val status: Double = js.native
  
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
  implicit class applicationCacheMutableBuilder[Self <: applicationCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotapplicationCache_typekey(value: applicationCache): Self = StObject.set(x, "MSHTML.applicationCache_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncached(value: js.Any): Self = StObject.set(x, "oncached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchecking(value: js.Any): Self = StObject.set(x, "onchecking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndownloading(value: js.Any): Self = StObject.set(x, "ondownloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnnoupdate(value: js.Any): Self = StObject.set(x, "onnoupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnobsolete(value: js.Any): Self = StObject.set(x, "onobsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogress(value: js.Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnupdateready(value: js.Any): Self = StObject.set(x, "onupdateready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapCache(value: () => Unit): Self = StObject.set(x, "swapCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
