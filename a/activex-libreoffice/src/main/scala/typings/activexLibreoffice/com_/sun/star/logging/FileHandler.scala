package typings.activexLibreoffice.com_.sun.star.logging

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a component implementing a log handler whose output channel is a file.
  *
  * The handler will use the `Encoding` attribute of {@link XLogHandler} to determine how to encode strings before actually writing them to the output
  * file.
  * @see XLogHandler.Encoding
  * @since OOo 2.3
  */
@js.native
trait FileHandler extends XLogHandler {
  
  /**
    * creates a log handler whose output is directed to a file given by URL.
    * @param FileURL the URL of the file to be created. This URL is resolved using the {@link com.sun.star.util.PathSubstitution} service. That is, it is allo
    */
  def create(FileURL: String): Unit = js.native
  
  /**
    * creates an instance of the log handler, using generic settings
    * @param Settings contains the initial settings for the log handler  The following settings are recognized and supported: `Encoding` - denotes the initial
    * @throws com::sun::star::lang::IllegalArgumentException if `Settings` contains settings whose value is of the wrong type.
    */
  def createWithSettings(Settings: SeqEquiv[NamedValue]): Unit = js.native
}
object FileHandler {
  
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): FileHandler = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], Formatter = Formatter.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), create = js.Any.fromFunction1(create), createWithSettings = js.Any.fromFunction1(createWithSettings), dispose = js.Any.fromFunction0(dispose), flush = js.Any.fromFunction0(flush), publish = js.Any.fromFunction1(publish), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[FileHandler]
  }
  
  @scala.inline
  implicit class FileHandlerOps[Self <: FileHandler] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithSettings(value: SeqEquiv[NamedValue] => Unit): Self = this.set("createWithSettings", js.Any.fromFunction1(value))
  }
}
