package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component implementing a log handler whose output channel is a file.
  *
  * The handler will use the `Encoding` attribute of {@link XLogHandler} to determine how to encode strings before actually writing them to the output
  * file.
  * @see XLogHandler.Encoding
  * @since OOo 2.3
  */
trait FileHandler extends XLogHandler {
  /**
    * creates a log handler whose output is directed to a file given by URL.
    * @param FileURL the URL of the file to be created. This URL is resolved using the {@link com.sun.star.util.PathSubstitution} service. That is, it is allo
    */
  def create(FileURL: java.lang.String): scala.Unit
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains settings whose value is of the wrong type.
    */
  def createWithSettings(
    Settings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
}

object FileHandler {
  @scala.inline
  def apply(
    Encoding: java.lang.String,
    Formatter: XLogFormatter,
    Level: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    create: js.Function1[java.lang.String, scala.Unit],
    createWithSettings: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    publish: js.Function1[LogRecord, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): FileHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding, Formatter = Formatter, Level = Level, acquire = acquire, addEventListener = addEventListener, create = create, createWithSettings = createWithSettings, dispose = dispose, flush = flush, publish = publish, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[FileHandler]
  }
}

