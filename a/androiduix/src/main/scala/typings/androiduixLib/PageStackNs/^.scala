package typings
package androiduixLib.PageStackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PageStack")
@js.native
object ^ extends js.Object {
  var DEBUG: scala.Boolean = js.native
  var backListener: js.Function0[scala.Boolean] = js.native
  var currentStack: androiduixLib.PageStackNs.StateStack = js.native
  var pageCloseHandler: js.Function2[/* pageId */ java.lang.String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
  var pageOpenHandler: js.Function3[
    /* pageId */ java.lang.String, 
    /* pageExtra */ js.UndefOr[js.Any], 
    /* isRestore */ js.UndefOr[scala.Boolean], 
    js.Any
  ] = js.native
  var pagePushHandler: js.Function2[/* pageId */ java.lang.String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
  def back(): scala.Unit = js.native
  def back(pageAlreadyClose: scala.Boolean): scala.Unit = js.native
  def backToPage(pageId: java.lang.String): scala.Unit = js.native
  def getPageExtra(): js.Any = js.native
  def getPageExtra(pageId: java.lang.String): js.Any = js.native
  def go(delta: scala.Double): scala.Unit = js.native
  def go(delta: scala.Double, pageAlreadyClose: scala.Boolean): scala.Unit = js.native
  def historyGo(delta: scala.Double): scala.Unit = js.native
  def historyGo(delta: scala.Double, ensureFaked: scala.Boolean): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def notifyNewPageOpened(pageId: java.lang.String): scala.Unit = js.native
  def notifyNewPageOpened(pageId: java.lang.String, extra: js.Any): scala.Unit = js.native
  def notifyPageClosed(pageId: java.lang.String): scala.Unit = js.native
  def openPage(pageId: java.lang.String): js.Any = js.native
  def openPage(pageId: java.lang.String, extra: js.Any): js.Any = js.native
  def preClosePageHasIFrame(historyLengthWhenInitIFrame: scala.Double): scala.Unit = js.native
  def setPageExtra(extra: js.Any): scala.Unit = js.native
  def setPageExtra(extra: js.Any, pageId: java.lang.String): scala.Unit = js.native
}

