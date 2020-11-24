package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceModel[S] extends js.Object {
  
  def error(args: js.Any): Unit = js.native
  
  var interceptResponse: js.UndefOr[
    js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _]
  ] = js.native
  
  var loading: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  
  var local: js.UndefOr[js.Function2[/* state */ js.Any, /* repeated */ js.Any, _]] = js.native
  
  def remote(state: js.Any, args: js.Any*): js.Promise[S] = js.native
  
  var shouldFetch: js.UndefOr[js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean], Unit]] = js.native
  
  def success(state: S): Unit = js.native
}
object SourceModel {
  
  @scala.inline
  def apply[S](
    error: js.Any => Unit,
    remote: (js.Any, /* repeated */ js.Any) => js.Promise[S],
    success: S => Unit
  ): SourceModel[S] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), remote = js.Any.fromFunction2(remote), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SourceModel[S]]
  }
  
  @scala.inline
  implicit class SourceModelOps[Self <: SourceModel[_], S] (val x: Self with SourceModel[S]) extends AnyVal {
    
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
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemote(value: (js.Any, /* repeated */ js.Any) => js.Promise[S]): Self = this.set("remote", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: S => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterceptResponse(value: (/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any) => _): Self = this.set("interceptResponse", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInterceptResponse: Self = this.set("interceptResponse", js.undefined)
    
    @scala.inline
    def setLoading(value: /* args */ js.Any => Unit): Self = this.set("loading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLocal(value: (/* state */ js.Any, /* repeated */ js.Any) => _): Self = this.set("local", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setShouldFetch(value: /* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean] => Unit): Self = this.set("shouldFetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldFetch: Self = this.set("shouldFetch", js.undefined)
  }
}
