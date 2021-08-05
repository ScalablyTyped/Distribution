package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends {@link TransferInfo} structure to give some additional parameters for transfers. */
trait TransferInfo2
  extends StObject
     with TransferInfo {
  
  /** contains the MIME type of the source of the action */
  var MimeType: String
}
object TransferInfo2 {
  
  inline def apply(MimeType: String, MoveData: Boolean, NameClash: Double, NewTitle: String, SourceURL: String): TransferInfo2 = {
    val __obj = js.Dynamic.literal(MimeType = MimeType.asInstanceOf[js.Any], MoveData = MoveData.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo2]
  }
  
  extension [Self <: TransferInfo2](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
  }
}
