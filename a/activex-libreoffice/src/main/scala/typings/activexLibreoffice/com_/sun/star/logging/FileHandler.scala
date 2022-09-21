package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a component implementing a log handler whose output channel is a file.
  *
  * The handler will use the `Encoding` attribute of {@link XLogHandler} to determine how to encode strings before actually writing them to the output
  * file.
  * @see XLogHandler.Encoding
  * @since OOo 2.3
  */
trait FileHandler
  extends StObject
     with XLogHandler {
  
  /**
    * creates a log handler whose output is directed to a file given by URL.
    * @param FileURL the URL of the file to be created. This URL is resolved using the {@link com.sun.star.util.PathSubstitution} service. That is, it is allo
    */
  def create(FileURL: String): Unit
  
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains settings whose value is of the wrong type.
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit
}
object FileHandler {
  
  inline def apply(
    Encoding: String,
    Formatter: XLogFormatter,
    Level: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    create: String => Unit,
    createWithSettings: SeqEquiv[NamedValue] => Unit,
    dispose: () => Unit,
    flush: () => Unit,
    publish: LogRecord => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): FileHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), create = js.Any.fromFunction1(create), createWithSettings = js.Any.fromFunction1(createWithSettings), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[FileHandler]
  }
  
  extension [Self <: FileHandler](x: Self) {
    
    inline def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateWithSettings(value: SeqEquiv[NamedValue] => Unit): Self = StObject.set(x, "createWithSettings", js.Any.fromFunction1(value))
  }
}
