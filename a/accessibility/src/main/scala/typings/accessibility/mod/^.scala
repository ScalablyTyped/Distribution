package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adaptive Accessibility Menu
  */
@JSImport("accessibility", JSImport.Namespace)
@js.native
class ^ () extends Accessibility {
  def this(options: Options) = this()
  /* CompleteClass */
  override val menuInterface: MenuInterface = js.native
  /* CompleteClass */
  override def alterTextSpace(isIncrease: Boolean): Unit = js.native
  /* CompleteClass */
  override def build(): Unit = js.native
  /* CompleteClass */
  override def deleteOppositesIfDefined(options: Options): Options = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def disabledUnsupportedFeatures(): Unit = js.native
  /* CompleteClass */
  override def fontFallback(): Unit = js.native
  /* CompleteClass */
  override def initFontSize(): Unit = js.native
  /* CompleteClass */
  override def injectCss(): Unit = js.native
  /* CompleteClass */
  override def invoke(action: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def listen(): Unit = js.native
  /* CompleteClass */
  override def onChange(updateSession: Boolean): Unit = js.native
  /* CompleteClass */
  override def read(): Unit = js.native
  /* CompleteClass */
  override def resetIfDefined(src: js.Any, dest: js.Any, prop: String): Unit = js.native
  /* CompleteClass */
  override def runHotkey(name: String): Unit = js.native
  /* CompleteClass */
  override def saveSession(): Unit = js.native
  /* CompleteClass */
  override def setSessionFromCache(): Unit = js.native
  /* CompleteClass */
  override def speechToText(): Unit = js.native
  /* CompleteClass */
  override def textToSpeech(text: String): Unit = js.native
  /* CompleteClass */
  override def toggleMenu(): Unit = js.native
}

@JSImport("accessibility", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated */
  def init(): Accessibility = js.native
  def init(options: Options): Accessibility = js.native
}

