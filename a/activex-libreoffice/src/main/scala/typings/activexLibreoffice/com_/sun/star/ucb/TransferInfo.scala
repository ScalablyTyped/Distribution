package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains information needed to transfer objects from one location to another.
  *
  * The transfer command is always called on the target folder. For a details description of the transfer command refer to the documentation of service
  * {@link Content} .
  */
trait TransferInfo extends StObject {
  
  /** contains the flags describing whether the data shall be moved instead of copied. */
  var MoveData: Boolean
  
  /**
    * describes how to act in case of title clashes while transferring the data.
    *
    * A title clash for instance occurs, if a file named "foo.txt" is to be transferred to a folder already containing another file named "foo.txt".
    *
    * The value can be one of the {@link NameClash} constants.
    *
    * Implementations that are not able to detect whether there is a clashing resource may ignore {@link NameClash.ERROR} and {@link NameClash.RENAME}
    * always write the new data.
    */
  var NameClash: Double
  
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being transferred.
    */
  var NewTitle: String
  
  /** contains the URL of the source of the action (e.g. the URL of a file to move). */
  var SourceURL: String
}
object TransferInfo {
  
  inline def apply(MoveData: Boolean, NameClash: Double, NewTitle: String, SourceURL: String): TransferInfo = {
    val __obj = js.Dynamic.literal(MoveData = MoveData.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferInfo] (val x: Self) extends AnyVal {
    
    inline def setMoveData(value: Boolean): Self = StObject.set(x, "MoveData", value.asInstanceOf[js.Any])
    
    inline def setNameClash(value: Double): Self = StObject.set(x, "NameClash", value.asInstanceOf[js.Any])
    
    inline def setNewTitle(value: String): Self = StObject.set(x, "NewTitle", value.asInstanceOf[js.Any])
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "SourceURL", value.asInstanceOf[js.Any])
  }
}
