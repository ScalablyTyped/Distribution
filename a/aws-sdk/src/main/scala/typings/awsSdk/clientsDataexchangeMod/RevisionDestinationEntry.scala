package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionDestinationEntry extends StObject {
  
  /**
    * The Amazon S3 bucket that is the destination for the assets in the revision.
    */
  var Bucket: _String
  
  /**
    * A string representing the pattern for generated names of the individual assets in the revision. For more information about key patterns, see Key patterns when exporting revisions.
    */
  var KeyPattern: js.UndefOr[_String] = js.undefined
  
  /**
    * The unique identifier for the revision.
    */
  var RevisionId: Id
}
object RevisionDestinationEntry {
  
  inline def apply(Bucket: _String, RevisionId: Id): RevisionDestinationEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionDestinationEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevisionDestinationEntry] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: _String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPattern(value: _String): Self = StObject.set(x, "KeyPattern", value.asInstanceOf[js.Any])
    
    inline def setKeyPatternUndefined: Self = StObject.set(x, "KeyPattern", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
