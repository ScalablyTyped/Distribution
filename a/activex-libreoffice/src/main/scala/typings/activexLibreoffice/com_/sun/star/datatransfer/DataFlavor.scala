package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Each instance represents the concept of a data format as it would appear on a clipboard, or during drag and drop. */
@js.native
trait DataFlavor extends StObject {
  
  /** The type of the object to transfer, for example, XOutputStream. */
  var DataType: `type` = js.native
  
  /** A human presentable name for the data format. */
  var HumanPresentableName: String = js.native
  
  /**
    * The MIME content-type (type/subtype) string describing the data format of the object to transfer. MimeType must conform to [Rfc2045]{@link
    * url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} )
    */
  var MimeType: String = js.native
}
object DataFlavor {
  
  @scala.inline
  def apply(DataType: `type`, HumanPresentableName: String, MimeType: String): DataFlavor = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], HumanPresentableName = HumanPresentableName.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFlavor]
  }
  
  @scala.inline
  implicit class DataFlavorMutableBuilder[Self <: DataFlavor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: `type`): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanPresentableName(value: String): Self = StObject.set(x, "HumanPresentableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
  }
}
