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
  
  inline def apply(
    PrintOptions: SafeArray[PropertyValue],
    Printable: XPrintable,
    Printer: SafeArray[PropertyValue],
    acquire: () => Unit,
    cancelJob: () => Unit,
    getPrintOptions: () => SafeArray[PropertyValue],
    getPrintable: () => XPrintable,
    getPrinter: () => SafeArray[PropertyValue],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPrintJob = {
    val __obj = js.Dynamic.literal(PrintOptions = PrintOptions.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], Printer = Printer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancelJob = js.Any.fromFunction0(cancelJob), getPrintOptions = js.Any.fromFunction0(getPrintOptions), getPrintable = js.Any.fromFunction0(getPrintable), getPrinter = js.Any.fromFunction0(getPrinter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrintJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPrintJob] (val x: Self) extends AnyVal {
    
    inline def setCancelJob(value: () => Unit): Self = StObject.set(x, "cancelJob", js.Any.fromFunction0(value))
    
    inline def setGetPrintOptions(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPrintOptions", js.Any.fromFunction0(value))
    
    inline def setGetPrintable(value: () => XPrintable): Self = StObject.set(x, "getPrintable", js.Any.fromFunction0(value))
    
    inline def setGetPrinter(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPrinter", js.Any.fromFunction0(value))
    
    inline def setPrintOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PrintOptions", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: XPrintable): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setPrinter(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Printer", value.asInstanceOf[js.Any])
  }
}
