package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adaptive Accessibility Menu
  */
@js.native
trait Accessibility extends js.Object {
  val menuInterface: MenuInterface = js.native
  def alterTextSpace(isIncrease: Boolean): Unit = js.native
  def build(): Unit = js.native
  def deleteOppositesIfDefined(options: Options): Options = js.native
  def destroy(): Unit = js.native
  def disabledUnsupportedFeatures(): Unit = js.native
  def fontFallback(): Unit = js.native
  def initFontSize(): Unit = js.native
  def injectCss(): Unit = js.native
  def invoke(action: js.Function0[Unit]): Unit = js.native
  def listen(): Unit = js.native
  def onChange(updateSession: Boolean): Unit = js.native
  def read(): Unit = js.native
  def resetIfDefined(src: js.Any, dest: js.Any, prop: String): Unit = js.native
  def runHotkey(name: String): Unit = js.native
  def saveSession(): Unit = js.native
  def setSessionFromCache(): Unit = js.native
  def speechToText(): Unit = js.native
  def textToSpeech(text: String): Unit = js.native
  def toggleMenu(): Unit = js.native
}

object Accessibility {
  @scala.inline
  def apply(
    alterTextSpace: Boolean => Unit,
    build: () => Unit,
    deleteOppositesIfDefined: Options => Options,
    destroy: () => Unit,
    disabledUnsupportedFeatures: () => Unit,
    fontFallback: () => Unit,
    initFontSize: () => Unit,
    injectCss: () => Unit,
    invoke: js.Function0[Unit] => Unit,
    listen: () => Unit,
    menuInterface: MenuInterface,
    onChange: Boolean => Unit,
    read: () => Unit,
    resetIfDefined: (js.Any, js.Any, String) => Unit,
    runHotkey: String => Unit,
    saveSession: () => Unit,
    setSessionFromCache: () => Unit,
    speechToText: () => Unit,
    textToSpeech: String => Unit,
    toggleMenu: () => Unit
  ): Accessibility = {
    val __obj = js.Dynamic.literal(alterTextSpace = js.Any.fromFunction1(alterTextSpace), build = js.Any.fromFunction0(build), deleteOppositesIfDefined = js.Any.fromFunction1(deleteOppositesIfDefined), destroy = js.Any.fromFunction0(destroy), disabledUnsupportedFeatures = js.Any.fromFunction0(disabledUnsupportedFeatures), fontFallback = js.Any.fromFunction0(fontFallback), initFontSize = js.Any.fromFunction0(initFontSize), injectCss = js.Any.fromFunction0(injectCss), invoke = js.Any.fromFunction1(invoke), listen = js.Any.fromFunction0(listen), menuInterface = menuInterface.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), read = js.Any.fromFunction0(read), resetIfDefined = js.Any.fromFunction3(resetIfDefined), runHotkey = js.Any.fromFunction1(runHotkey), saveSession = js.Any.fromFunction0(saveSession), setSessionFromCache = js.Any.fromFunction0(setSessionFromCache), speechToText = js.Any.fromFunction0(speechToText), textToSpeech = js.Any.fromFunction1(textToSpeech), toggleMenu = js.Any.fromFunction0(toggleMenu))
    __obj.asInstanceOf[Accessibility]
  }
  @scala.inline
  implicit class AccessibilityOps[Self <: Accessibility] (val x: Self) extends AnyVal {
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
    def setAlterTextSpace(value: Boolean => Unit): Self = this.set("alterTextSpace", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => Unit): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteOppositesIfDefined(value: Options => Options): Self = this.set("deleteOppositesIfDefined", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisabledUnsupportedFeatures(value: () => Unit): Self = this.set("disabledUnsupportedFeatures", js.Any.fromFunction0(value))
    @scala.inline
    def setFontFallback(value: () => Unit): Self = this.set("fontFallback", js.Any.fromFunction0(value))
    @scala.inline
    def setInitFontSize(value: () => Unit): Self = this.set("initFontSize", js.Any.fromFunction0(value))
    @scala.inline
    def setInjectCss(value: () => Unit): Self = this.set("injectCss", js.Any.fromFunction0(value))
    @scala.inline
    def setInvoke(value: js.Function0[Unit] => Unit): Self = this.set("invoke", js.Any.fromFunction1(value))
    @scala.inline
    def setListen(value: () => Unit): Self = this.set("listen", js.Any.fromFunction0(value))
    @scala.inline
    def setMenuInterface(value: MenuInterface): Self = this.set("menuInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: () => Unit): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setResetIfDefined(value: (js.Any, js.Any, String) => Unit): Self = this.set("resetIfDefined", js.Any.fromFunction3(value))
    @scala.inline
    def setRunHotkey(value: String => Unit): Self = this.set("runHotkey", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveSession(value: () => Unit): Self = this.set("saveSession", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSessionFromCache(value: () => Unit): Self = this.set("setSessionFromCache", js.Any.fromFunction0(value))
    @scala.inline
    def setSpeechToText(value: () => Unit): Self = this.set("speechToText", js.Any.fromFunction0(value))
    @scala.inline
    def setTextToSpeech(value: String => Unit): Self = this.set("textToSpeech", js.Any.fromFunction1(value))
    @scala.inline
    def setToggleMenu(value: () => Unit): Self = this.set("toggleMenu", js.Any.fromFunction0(value))
  }
  
}

