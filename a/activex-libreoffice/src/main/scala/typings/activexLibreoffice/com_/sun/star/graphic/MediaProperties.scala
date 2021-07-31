package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service describes the properties that are used when using the {@link XGraphicProvider} interface methods */
trait MediaProperties extends StObject {
  
  /** Additional properties that will be passed to the appropriate filter module. */
  var FilterData: PropertyValues
  
  /**
    * This property is only used for loading graphics or querying graphic descriptors
    *
    * A {@link InputStream} can be used instead of the {@link URL} property
    * @see com.sun.star.io.XInputStream
    */
  var InputStream: XInputStream
  
  /**
    * This property is only used for storing graphics and describes the format into which the graphic is to be converted
    *
    * At the moment, the following mime types are supported for storing graphics:
    *
    * sterimage/x-emfimage/x-epsimage/x-metimage/x-pictimage/x-portable-bitmapimage/x-portable-pixmapimage/x-wmfimage/x-svmimage/x-xpixmapimage/x-vclgraphic
    */
  var MimeType: String
  
  /**
    * This property is only used for storing graphics
    *
    * A {@link OutputStream} can be used instead of the {@link URL} property
    * @see com.sun.star.io.XStream
    */
  var OutputStream: XStream
  
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
  var URL: String
}
object MediaProperties {
  
  @scala.inline
  def apply(
    FilterData: PropertyValues,
    InputStream: XInputStream,
    MimeType: String,
    OutputStream: XStream,
    URL: String
  ): MediaProperties = {
    val __obj = js.Dynamic.literal(FilterData = FilterData.asInstanceOf[js.Any], InputStream = InputStream.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProperties]
  }
  
  @scala.inline
  implicit class MediaPropertiesMutableBuilder[Self <: MediaProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterData(value: PropertyValues): Self = StObject.set(x, "FilterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDataVarargs(value: PropertyValue*): Self = StObject.set(x, "FilterData", js.Array(value :_*))
    
    @scala.inline
    def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputStream(value: XStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
