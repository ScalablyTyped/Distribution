package typings.androiduix.PageStackNs

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
  def back(): Unit = js.native
  def back(pageAlreadyClose: Boolean): Unit = js.native
  def backToPage(pageId: String): Unit = js.native
  def getPageExtra(): js.Any = js.native
  def getPageExtra(pageId: String): js.Any = js.native
  def go(delta: Double): Unit = js.native
  def go(delta: Double, pageAlreadyClose: Boolean): Unit = js.native
  def historyGo(delta: Double): Unit = js.native
  def historyGo(delta: Double, ensureFaked: Boolean): Unit = js.native
  def init(): Unit = js.native
  def notifyNewPageOpened(pageId: String): Unit = js.native
  def notifyNewPageOpened(pageId: String, extra: js.Any): Unit = js.native
  def notifyPageClosed(pageId: String): Unit = js.native
  def openPage(pageId: String): js.Any = js.native
  def openPage(pageId: String, extra: js.Any): js.Any = js.native
  def preClosePageHasIFrame(historyLengthWhenInitIFrame: Double): Unit = js.native
  def setPageExtra(extra: js.Any): Unit = js.native
  def setPageExtra(extra: js.Any, pageId: String): Unit = js.native
}

