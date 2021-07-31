package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJob} is implemented by print jobs that are created by classes that implement {@link XPrintable} . It gives information about the context
  * of the print job.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJob
  extends StObject
     with XInterface {
  
  /** returns the {@link PrintOptions} used for the print job */
  val PrintOptions: SafeArray[PropertyValue]
  
  /** returns the printed object used for the print job */
  val Printable: XPrintable
  
  /** returns the Printer used for the print job */
  val Printer: SafeArray[PropertyValue]
  
  def cancelJob(): Unit
  
  /** returns the {@link PrintOptions} used for the print job */
  def getPrintOptions(): SafeArray[PropertyValue]
  
  /** returns the printed object used for the print job */
  def getPrintable(): XPrintable
  
  /** returns the Printer used for the print job */
  def getPrinter(): SafeArray[PropertyValue]
}
object XPrintJob {
  
  @scala.inline
  def apply(
    PrintOptions: SafeArray[PropertyValue],
    Printable: XPrintable,
    Printer: SafeArray[PropertyValue],
    acquire: () => Unit,
    cancelJob: () => Unit,
    getPrintOptions: () => SafeArray[PropertyValue],
    getPrintable: () => XPrintable,
    getPrinter: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrintJob = {
    val __obj = js.Dynamic.literal(PrintOptions = PrintOptions.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], Printer = Printer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancelJob = js.Any.fromFunction0(cancelJob), getPrintOptions = js.Any.fromFunction0(getPrintOptions), getPrintable = js.Any.fromFunction0(getPrintable), getPrinter = js.Any.fromFunction0(getPrinter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrintJob]
  }
  
  @scala.inline
  implicit class XPrintJobMutableBuilder[Self <: XPrintJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelJob(value: () => Unit): Self = StObject.set(x, "cancelJob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrintOptions(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPrintOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrintable(value: () => XPrintable): Self = StObject.set(x, "getPrintable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrinter(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPrinter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PrintOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: XPrintable): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinter(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Printer", value.asInstanceOf[js.Any])
  }
}
