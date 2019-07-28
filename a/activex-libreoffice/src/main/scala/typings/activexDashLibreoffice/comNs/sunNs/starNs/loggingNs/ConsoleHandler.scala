package typings.activexDashLibreoffice.comNs.sunNs.starNs.loggingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component implementing a log handler whose output channel is the processes console.
  * @since OOo 2.3
  */
trait ConsoleHandler extends XConsoleHandler {
  def create(): Unit
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains arguments with names other than in the list above, or settings whose value
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit
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
    val __obj = js.Dynamic.literal(Encoding = Encoding, Formatter = Formatter, Level = Level, Threshold = Threshold, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), create = js.Any.fromFunction0(create), createWithSettings = js.Any.fromFunction1(createWithSettings), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[ConsoleHandler]
  }
}

