package typings.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PageStack")
@js.native
object ^ extends js.Object {
  var DEBUG: Boolean = js.native
  var backListener: js.Function0[Boolean] = js.native
  var currentStack: StateStack = js.native
  var pageCloseHandler: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
  var pageOpenHandler: js.Function3[
    /* pageId */ String, 
    /* pageExtra */ js.UndefOr[js.Any], 
    /* isRestore */ js.UndefOr[Boolean], 
    js.Any
  ] = js.native
  var pagePushHandler: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
}

