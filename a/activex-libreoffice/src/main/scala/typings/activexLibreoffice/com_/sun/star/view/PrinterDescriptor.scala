package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.awt.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a printer by specifying the queue name and some settings.
  *
  * This service may be represented by a {@link com.sun.star.beans.PropertyValue} [].
  * @see com.sun.star.beans.PropertyValue
  */
@js.native
trait PrinterDescriptor extends js.Object {
  
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperFormat} . */
  var CanSetPaperFormat: Boolean = js.native
  
  /** indicates, whether the printer allows changes to {@link PrinterDescriptor.PaperOrientation} . */
  var CanSetPaperOrientation: Boolean = js.native
  
  /** indicates if the printer allows changes to {@link PrinterDescriptor.PaperSize} . */
  var CanSetPaperSize: Boolean = js.native
  
  /** indicates, whether the printer is busy or not. */
  var IsBusy: Boolean = js.native
  
  /**
    * specifies the name of the printer queue to be used.
    *
    * Which printer queues are available, can be figured out with the system library of the used programming language/environment.
    */
  var Name: String = js.native
  
  /**
    * specifies a predefined paper size or if the paper size is a user-defined size.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperSize} .
    */
  var PaperFormat: typings.activexLibreoffice.com_.sun.star.view.PaperFormat = js.native
  
  /** specifies the orientation of the paper. */
  var PaperOrientation: typings.activexLibreoffice.com_.sun.star.view.PaperOrientation = js.native
  
  /**
    * specifies the size of the paper in 100th mm.
    *
    * Setting this property may change the value of {@link PrinterDescriptor.PaperFormat} .
    */
  var PaperSize: Size = js.native
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
  implicit class PrinterDescriptorOps[Self <: PrinterDescriptor] (val x: Self) extends AnyVal {
    
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
    def setCanSetPaperFormat(value: Boolean): Self = this.set("CanSetPaperFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSetPaperOrientation(value: Boolean): Self = this.set("CanSetPaperOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSetPaperSize(value: Boolean): Self = this.set("CanSetPaperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBusy(value: Boolean): Self = this.set("IsBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperFormat(value: PaperFormat): Self = this.set("PaperFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperOrientation(value: PaperOrientation): Self = this.set("PaperOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSize(value: Size): Self = this.set("PaperSize", value.asInstanceOf[js.Any])
  }
}
