package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * support "flat" and "deep" type detection of a given document
  *
  * A "flat" detection means specifying the document format by using the URL and some configuration data only. That will perform but produce may invalid
  * results if e.g., the extension of the document is wrong. A "deep" detection means looking into the document stream to be right which format it
  * supports. Of course that includes a "flat" detection before. The combination of both ones should produce stable results every time.
  * @see TypeDetection
  */
trait XTypeDetection extends XInterface {
  /**
    * make a "deep" detection or optional a "flat" detection by using a {@link MediaDescriptor}
    *
    * Instead of {@link XTypeDetection.queryTypeByURL()} this function use a {@link MediaDescriptor} to specify the document for detection. Such descriptor
    * hold different information about the document. It will be passed to any part of made detection process and every part can change it to actualize it.
    * The property {@link MediaDescriptor.URL} should be set on this descriptor as minimum. It specifies the location of the document. If this parameter is
    * missing another one is required: {@link MediaDescriptor.InputStream} . This can be useful to prevent operation against multiple opening of the stream
    * and perform the operation. If this stream isn't already included the detection will open it (if allowed!) and add it to the descriptor so it will be
    * available for all following parts. A combination of both parameters can be useful to perform the operation and make results more stable; but only one
    * of them is required. Of course its possible to specify more document properties (e.g. {@link MediaDescriptor.ReadOnly} ). ;  As an additional feature
    * it's possible to suppress "deep" detection by using argument **AllowDeep** .
    * @param Descriptor means the {@link MediaDescriptor} which specify the resource for detection
    * @param AllowDeep if it is set to `TRUE` a "deep" detection will be follow a "flat" detection ;  if it is set to `FALSE` a "flat" detection will be made only
    * @returns an internal type name which represent the detected format ;  or an empty value for unknown ones
    */
  def queryTypeByDescriptor(Descriptor: js.Array[SeqEquiv[PropertyValue]], AllowDeep: Boolean): String
  /**
    * make a "flat" detection by using the URL of the document
    *
    * It use given URL in combination with the internal configuration of well known types only to specify the format of given document.
    * @param URL specify the document by name
    * @returns an internal type name which represent the detected format ;  or an empty value for unknown ones
    */
  def queryTypeByURL(URL: String): String
}

object XTypeDetection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryTypeByDescriptor: (js.Array[SeqEquiv[PropertyValue]], Boolean) => String,
    queryTypeByURL: String => String,
    release: () => Unit
  ): XTypeDetection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryTypeByDescriptor = js.Any.fromFunction2(queryTypeByDescriptor), queryTypeByURL = js.Any.fromFunction1(queryTypeByURL), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeDetection]
  }
}

