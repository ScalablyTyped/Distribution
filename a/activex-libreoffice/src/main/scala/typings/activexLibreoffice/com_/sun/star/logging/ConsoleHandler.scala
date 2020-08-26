package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component implementing a log handler whose output channel is the processes console.
  * @since OOo 2.3
  */
@js.native
trait ConsoleHandler extends XConsoleHandler {
  def create(): Unit = js.native
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains arguments with names other than in the list above, or settings whose value
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit = js.native
}

object ConsoleHandler {
  @scala.inline
  def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    Threshold: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    create: () => Unit,
    createWithSettings: SeqEquiv[NamedValue] => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    publish: LogRecord => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): ConsoleHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), create = js.Any.fromFunction0(create), createWithSettings = js.Any.fromFunction1(createWithSettings), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[ConsoleHandler]
  }
  @scala.inline
  implicit class ConsoleHandlerOps[Self <: ConsoleHandler] (val x: Self) extends AnyVal {
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateWithSettings(value: SeqEquiv[NamedValue] => Unit): Self = this.set("createWithSettings", js.Any.fromFunction1(value))
  }
  
}

