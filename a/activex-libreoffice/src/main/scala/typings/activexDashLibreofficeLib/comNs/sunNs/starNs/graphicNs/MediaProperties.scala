package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service describes the properties that are used when using the {@link XGraphicProvider} interface methods */
trait MediaProperties extends js.Object {
  /** Additional properties that will be passed to the appropriate filter module. */
  var FilterData: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /**
    * This property is only used for loading graphics or querying graphic descriptors
    *
    * A {@link InputStream} can be used instead of the {@link URL} property
    * @see com.sun.star.io.XInputStream
    */
  var InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * This property is only used for storing graphics and describes the format into which the graphic is to be converted
    *
    * At the moment, the following mime types are supported for storing graphics:
    *
    * sterimage/x-emfimage/x-epsimage/x-metimage/x-pictimage/x-portable-bitmapimage/x-portable-pixmapimage/x-wmfimage/x-svmimage/x-xpixmapimage/x-vclgraphic
    */
  var MimeType: java.lang.String
  /**
    * This property is only used for storing graphics
    *
    * A {@link OutputStream} can be used instead of the {@link URL} property
    * @see com.sun.star.io.XStream
    */
  var OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * Property that describes the location of the source or target of the graphic as URL.
    *
    * A URL can be used instead of the {@link InputStream} or {@link OutputStream} property
    *
    * In addition to the normal protocols like [file://]{@link url="file://"} or [http://]{@link url="http://"} you can use private URLs as follows to get
    * access to graphics lying inside the resource system within an Office context:
    *
    * 2345private:resource/projectshortname/image/12345private:resource/projectshortname/imagelist/12345private:resource/projectshortname/imagelist/12345/12
    * And additionally, {@link GraphicObject} scheme URLs like vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD can be used to access graphics
    * held by the GraphicCache implementation.
    *
    * Yet more, you can access graphics in the application-wide image repository by specifying URLs of the form
    * `private:graphicrepository/<path_in_repository>` .
    */
  var URL: java.lang.String
}

