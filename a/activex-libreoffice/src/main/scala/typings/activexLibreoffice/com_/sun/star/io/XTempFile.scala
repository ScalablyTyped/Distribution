package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface offers access to temp files. */
trait XTempFile
  extends StObject
     with XStream
     with XSeekable {
  
  /** This attribute controls whether the file will be automatically removed on object destruction. */
  var RemoveFile: Boolean
  
  /** This attribute specifies the temp file name. */
  var ResourceName: String
  
  /** This attribute specifies the URL of the temp file. */
  var Uri: String
}
object XTempFile {
  
  inline def apply(
    InputStream: XInputStream,
    Length: Double,
    OutputStream: XOutputStream,
    Position: Double,
    RemoveFile: Boolean,
    ResourceName: String,
    Uri: String,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getLength: () => Double,
    getOutputStream: () => XOutputStream,
    getPosition: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    seek: Double => Unit
  ): XTempFile = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RemoveFile = RemoveFile.asInstanceOf[js.Any], ResourceName = ResourceName.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[XTempFile]
  }
  
  extension [Self <: XTempFile](x: Self) {
    
    inline def setRemoveFile(value: Boolean): Self = StObject.set(x, "RemoveFile", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
