package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExportRevisionDestinationEntry extends StObject {
  
  /**
    * The Amazon S3 bucket that is the destination for the event action.
    */
  var Bucket: _String
  
  /**
    * A string representing the pattern for generated names of the individual assets in the revision. For more information about key patterns, see Key patterns when exporting revisions.
    */
  var KeyPattern: js.UndefOr[_String] = js.undefined
}
object AutoExportRevisionDestinationEntry {
  
  inline def apply(Bucket: _String): AutoExportRevisionDestinationEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExportRevisionDestinationEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoExportRevisionDestinationEntry] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: _String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPattern(value: _String): Self = StObject.set(x, "KeyPattern", value.asInstanceOf[js.Any])
    
    inline def setKeyPatternUndefined: Self = StObject.set(x, "KeyPattern", js.undefined)
  }
}
