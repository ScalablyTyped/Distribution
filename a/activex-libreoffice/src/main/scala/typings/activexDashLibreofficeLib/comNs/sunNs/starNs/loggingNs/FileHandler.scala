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

