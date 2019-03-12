package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An implementation of this interface represents a MIME content-type that conforms to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and
  * [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} . Instances that implement this interface could be created using the interface {@link
  * XMimeContentTypeFactory} .
  */
trait XMimeContentType
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  val FullMediaType: java.lang.String
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  val MediaSubtype: java.lang.String
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  val MediaType: java.lang.String
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  val Parameters: stdLib.SafeArray[java.lang.String]
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  def getFullMediaType(): java.lang.String
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  def getMediaSubtype(): java.lang.String
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  def getMediaType(): java.lang.String
  /**
    * To get the value of a specified parameter.
    * @param aName The name of the parameter for which the value is requested.
    * @returns The value of the specified parameter.
    * @throws com::sun::star::container::NoSuchElementException if the specified parameter doesn't exist.
    */
  def getParameterValue(aName: java.lang.String): java.lang.String
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  def getParameters(): stdLib.SafeArray[java.lang.String]
  /**
    * To query if a specific parameter is supported.
    * @param aName The name of the parameter to query for.
    * @returns A value of `TRUE` if the MIME content-type has the specified parameter. A value of `FALSE` if the MIME content-type has not the specified parameter.
    */
  def hasParameter(aName: java.lang.String): scala.Boolean
}

object XMimeContentType {
  @scala.inline
  def apply(
    FullMediaType: java.lang.String,
    MediaSubtype: java.lang.String,
    MediaType: java.lang.String,
    Parameters: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getFullMediaType: () => java.lang.String,
    getMediaSubtype: () => java.lang.String,
    getMediaType: () => java.lang.String,
    getParameterValue: java.lang.String => java.lang.String,
    getParameters: () => stdLib.SafeArray[java.lang.String],
    hasParameter: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMimeContentType = {
    val __obj = js.Dynamic.literal(FullMediaType = FullMediaType, MediaSubtype = MediaSubtype, MediaType = MediaType, Parameters = Parameters, acquire = js.Any.fromFunction0(acquire), getFullMediaType = js.Any.fromFunction0(getFullMediaType), getMediaSubtype = js.Any.fromFunction0(getMediaSubtype), getMediaType = js.Any.fromFunction0(getMediaType), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMimeContentType]
  }
}

