package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a "deep" filter detection
  *
  * A "deep" filter detection means looking into the document stream to detect the format of it. Services of type {@link ExtendedTypeDetection} must
  * support this interface to be called from generic load mechanism of the office for that.
  * @see DetectService
  * @see TypeDetection
  * @see FilterFactory
  */
@js.native
trait XExtendedFilterDetection extends XInterface {
  
  /**
    * controls agreement of a "flat" {@link TypeDetection} with given URL or arguments
    *
    * Registered services in configuration, which support this interface for different mime types, will be called automatically to look into the document
    * stream and decide which format it represent. Add the collected information about detected documents in given {@link MediaDescriptor}**Descriptor** .
    * The decision must be returned as any valid type name (which specifies the detected format) or an empty value for unknown formats.
    * @param Descriptor represent a {@link MediaDescriptor} which can be used to get/set information about the detected document
    * @returns an internal type name if format was detected successfully ;  or an empty value for an unknown document format.
    */
  def detect(Descriptor: js.Array[SeqEquiv[PropertyValue]]): String = js.native
}
object XExtendedFilterDetection {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    detect: js.Array[SeqEquiv[PropertyValue]] => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), detect = js.Any.fromFunction1(detect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
  
  @scala.inline
  implicit class XExtendedFilterDetectionOps[Self <: XExtendedFilterDetection] (val x: Self) extends AnyVal {
    
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
    def setDetect(value: js.Array[SeqEquiv[PropertyValue]] => String): Self = this.set("detect", js.Any.fromFunction1(value))
  }
}
