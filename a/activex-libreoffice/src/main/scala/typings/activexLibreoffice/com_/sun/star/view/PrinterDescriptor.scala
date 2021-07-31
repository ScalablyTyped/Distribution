package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a printer by specifying the queue name and some settings.
  *
  * This service may be represented by a {@link com.sun.star.beans.PropertyValue} [].
  * @see com.sun.star.beans.PropertyValue
  */
trait PrinterDescriptor extends StObject {
  
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperFormat} . */
  var CanSetPaperFormat: Boolean
  
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperOrientation} . */
  var CanSetPaperOrientation: Boolean
  
  /** indicates if the printer allows changes to {@link PrinterDescriptor.PaperSize} . */
  var CanSetPaperSize: Boolean
  
  /** indicates, whether the printer is busy or not. */
  var IsBusy: Boolean
  
  /**
    * specifies the name of the printer queue to be used.
    *
    * Which printer queues are available, can be figured out with the system library of the used programming language/environment.
    */
  var Name: String
  
  /**
    * specifies a predefined paper size or if the paper size is a user-defined size.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperSize} .
    */
  var PaperFormat: typings.activexLibreoffice.com_.sun.star.view.PaperFormat
  
  /** specifies the orientation of the paper. */
  var PaperOrientation: typings.activexLibreoffice.com_.sun.star.view.PaperOrientation
  
  /**
    * specifies the size of the paper in 100th mm.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperFormat} .
    */
  var PaperSize: Size
}
object PrinterDescriptor {
  
  @scala.inline
  def apply(
    CanSetPaperFormat: Boolean,
    CanSetPaperOrientation: Boolean,
    CanSetPaperSize: Boolean,
    IsBusy: Boolean,
    Name: String,
    PaperFormat: PaperFormat,
    PaperOrientation: PaperOrientation,
    PaperSize: Size
  ): PrinterDescriptor = {
    val __obj = js.Dynamic.literal(CanSetPaperFormat = CanSetPaperFormat.asInstanceOf[js.Any], CanSetPaperOrientation = CanSetPaperOrientation.asInstanceOf[js.Any], CanSetPaperSize = CanSetPaperSize.asInstanceOf[js.Any], IsBusy = IsBusy.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PaperFormat = PaperFormat.asInstanceOf[js.Any], PaperOrientation = PaperOrientation.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterDescriptor]
  }
  
  @scala.inline
  implicit class PrinterDescriptorMutableBuilder[Self <: PrinterDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanSetPaperFormat(value: Boolean): Self = StObject.set(x, "CanSetPaperFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSetPaperOrientation(value: Boolean): Self = StObject.set(x, "CanSetPaperOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSetPaperSize(value: Boolean): Self = StObject.set(x, "CanSetPaperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBusy(value: Boolean): Self = StObject.set(x, "IsBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperFormat(value: PaperFormat): Self = StObject.set(x, "PaperFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperOrientation(value: PaperOrientation): Self = StObject.set(x, "PaperOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSize(value: Size): Self = StObject.set(x, "PaperSize", value.asInstanceOf[js.Any])
  }
}
