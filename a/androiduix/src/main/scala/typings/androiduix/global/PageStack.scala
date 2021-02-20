package typings.androiduix.global

import typings.androiduix.PageStack.StateStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageStack {
  
  @JSGlobal("PageStack")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("PageStack.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.back")
  @js.native
  def back(): Unit = js.native
  @JSGlobal("PageStack.back")
  @js.native
  def back(pageAlreadyClose: Boolean): Unit = js.native
  
  @JSGlobal("PageStack.backListener")
  @js.native
  def backListener: js.Function0[Boolean] = js.native
  @scala.inline
  def backListener_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backListener")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.backToPage")
  @js.native
  def backToPage(pageId: String): Unit = js.native
  
  @JSGlobal("PageStack.currentStack")
  @js.native
  def currentStack: StateStack = js.native
  @scala.inline
  def currentStack_=(x: StateStack): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentStack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.getPageExtra")
  @js.native
  def getPageExtra(): js.Any = js.native
  @JSGlobal("PageStack.getPageExtra")
  @js.native
  def getPageExtra(pageId: String): js.Any = js.native
  
  @JSGlobal("PageStack.go")
  @js.native
  def go(delta: Double): Unit = js.native
  @JSGlobal("PageStack.go")
  @js.native
  def go(delta: Double, pageAlreadyClose: Boolean): Unit = js.native
  
  @JSGlobal("PageStack.historyGo")
  @js.native
  def historyGo(delta: Double): Unit = js.native
  @JSGlobal("PageStack.historyGo")
  @js.native
  def historyGo(delta: Double, ensureFaked: Boolean): Unit = js.native
  
  @JSGlobal("PageStack.init")
  @js.native
  def init(): Unit = js.native
  
  @JSGlobal("PageStack.notifyNewPageOpened")
  @js.native
  def notifyNewPageOpened(pageId: String): Unit = js.native
  @JSGlobal("PageStack.notifyNewPageOpened")
  @js.native
  def notifyNewPageOpened(pageId: String, extra: js.Any): Unit = js.native
  
  @JSGlobal("PageStack.notifyPageClosed")
  @js.native
  def notifyPageClosed(pageId: String): Unit = js.native
  
  @JSGlobal("PageStack.openPage")
  @js.native
  def openPage(pageId: String): js.Any = js.native
  @JSGlobal("PageStack.openPage")
  @js.native
  def openPage(pageId: String, extra: js.Any): js.Any = js.native
  
  @JSGlobal("PageStack.pageCloseHandler")
  @js.native
  def pageCloseHandler: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
  @scala.inline
  def pageCloseHandler_=(x: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageCloseHandler")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.pageOpenHandler")
  @js.native
  def pageOpenHandler: js.Function3[
    /* pageId */ String, 
    /* pageExtra */ js.UndefOr[js.Any], 
    /* isRestore */ js.UndefOr[Boolean], 
    js.Any
  ] = js.native
  @scala.inline
  def pageOpenHandler_=(
    x: js.Function3[
      /* pageId */ String, 
      /* pageExtra */ js.UndefOr[js.Any], 
      /* isRestore */ js.UndefOr[Boolean], 
      js.Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageOpenHandler")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.pagePushHandler")
  @js.native
  def pagePushHandler: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any] = js.native
  @scala.inline
  def pagePushHandler_=(x: js.Function2[/* pageId */ String, /* pageExtra */ js.UndefOr[js.Any], js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pagePushHandler")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PageStack.preClosePageHasIFrame")
  @js.native
  def preClosePageHasIFrame(historyLengthWhenInitIFrame: Double): Unit = js.native
  
  @JSGlobal("PageStack.setPageExtra")
  @js.native
  def setPageExtra(extra: js.Any): Unit = js.native
  @JSGlobal("PageStack.setPageExtra")
  @js.native
  def setPageExtra(extra: js.Any, pageId: String): Unit = js.native
}
