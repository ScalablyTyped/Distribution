package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientData extends StObject {
  
  /**
    * A user-defined comment about the disk upload.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the disk upload ends.
    */
  var UploadEnd: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size of the uploaded disk image, in GiB.
    */
  var UploadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The time that the disk upload starts.
    */
  var UploadStart: js.UndefOr[js.Date] = js.undefined
}
object ClientData {
  
  inline def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientData] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setUploadEnd(value: js.Date): Self = StObject.set(x, "UploadEnd", value.asInstanceOf[js.Any])
    
    inline def setUploadEndUndefined: Self = StObject.set(x, "UploadEnd", js.undefined)
    
    inline def setUploadSize(value: Double): Self = StObject.set(x, "UploadSize", value.asInstanceOf[js.Any])
    
    inline def setUploadSizeUndefined: Self = StObject.set(x, "UploadSize", js.undefined)
    
    inline def setUploadStart(value: js.Date): Self = StObject.set(x, "UploadStart", value.asInstanceOf[js.Any])
    
    inline def setUploadStartUndefined: Self = StObject.set(x, "UploadStart", js.undefined)
  }
}
