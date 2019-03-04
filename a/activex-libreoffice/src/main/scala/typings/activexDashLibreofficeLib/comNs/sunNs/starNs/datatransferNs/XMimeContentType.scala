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
  val Parameters: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getParameters(): activexDashInteropLib.SafeArray[java.lang.String]
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
    Parameters: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getFullMediaType: js.Function0[java.lang.String],
    getMediaSubtype: js.Function0[java.lang.String],
    getMediaType: js.Function0[java.lang.String],
    getParameterValue: js.Function1[java.lang.String, java.lang.String],
    getParameters: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasParameter: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMimeContentType = {
    val __obj = js.Dynamic.literal(FullMediaType = FullMediaType, MediaSubtype = MediaSubtype, MediaType = MediaType, Parameters = Parameters, acquire = acquire, getFullMediaType = getFullMediaType, getMediaSubtype = getMediaSubtype, getMediaType = getMediaType, getParameterValue = getParameterValue, getParameters = getParameters, hasParameter = hasParameter, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMimeContentType]
  }
}

