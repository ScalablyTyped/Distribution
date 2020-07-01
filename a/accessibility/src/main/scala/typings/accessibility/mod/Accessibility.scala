package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adaptive Accessibility Menu
  */
trait Accessibility extends js.Object {
  val menuInterface: MenuInterface
  def alterTextSpace(isIncrease: Boolean): Unit
  def build(): Unit
  def deleteOppositesIfDefined(options: Options): Options
  def destroy(): Unit
  def disabledUnsupportedFeatures(): Unit
  def fontFallback(): Unit
  def initFontSize(): Unit
  def injectCss(): Unit
  def invoke(action: js.Function0[Unit]): Unit
  def listen(): Unit
  def onChange(updateSession: Boolean): Unit
  def read(): Unit
  def resetIfDefined(src: js.Any, dest: js.Any, prop: String): Unit
  def runHotkey(name: String): Unit
  def saveSession(): Unit
  def setSessionFromCache(): Unit
  def speechToText(): Unit
  def textToSpeech(text: String): Unit
  def toggleMenu(): Unit
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
}

