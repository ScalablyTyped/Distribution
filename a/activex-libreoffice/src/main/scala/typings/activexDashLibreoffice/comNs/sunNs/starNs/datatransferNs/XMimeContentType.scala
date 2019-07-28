package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An implementation of this interface represents a MIME content-type that conforms to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and
  * [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} . Instances that implement this interface could be created using the interface {@link
  * XMimeContentTypeFactory} .
  */
trait XMimeContentType extends XInterface {
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  val FullMediaType: String
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  val MediaSubtype: String
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  val MediaType: String
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  val Parameters: SafeArray[String]
  /**
    * To get the full media/submedia type of the MIME content-type.
    * @returns The full media/submedia type of the MIME content-type.
    */
  def getFullMediaType(): String
  /**
    * To get the media subtype of the MIME content-type.
    * @returns The media subtype of the MIME content-type.
    */
  def getMediaSubtype(): String
  /**
    * To get the media type of the MIME content-type.
    * @returns The media type of the MIME content-type.
    */
  def getMediaType(): String
  /**
    * To get the value of a specified parameter.
    * @param aName The name of the parameter for which the value is requested.
    * @returns The value of the specified parameter.
    * @throws com::sun::star::container::NoSuchElementException if the specified parameter doesn't exist.
    */
  def getParameterValue(aName: String): String
  /**
    * To get a list of parameters that the MIME content-type contains.
    * @returns A list of the names of all parameters of the MIME content-type.
    */
  def getParameters(): SafeArray[String]
  /**
    * To query if a specific parameter is supported.
    * @param aName The name of the parameter to query for.
    * @returns A value of `TRUE` if the MIME content-type has the specified parameter. A value of `FALSE` if the MIME content-type has not the specified parameter.
    */
  def hasParameter(aName: String): Boolean
}

object XMimeContentType {
  @scala.inline
  def apply(
    FullMediaType: String,
    MediaSubtype: String,
    MediaType: String,
    Parameters: SafeArray[String],
    acquire: () => Unit,
    getFullMediaType: () => String,
    getMediaSubtype: () => String,
    getMediaType: () => String,
    getParameterValue: String => String,
    getParameters: () => SafeArray[String],
    hasParameter: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMimeContentType = {
    val __obj = js.Dynamic.literal(FullMediaType = FullMediaType, MediaSubtype = MediaSubtype, MediaType = MediaType, Parameters = Parameters, acquire = js.Any.fromFunction0(acquire), getFullMediaType = js.Any.fromFunction0(getFullMediaType), getMediaSubtype = js.Any.fromFunction0(getMediaSubtype), getMediaType = js.Any.fromFunction0(getMediaType), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMimeContentType]
  }
}

