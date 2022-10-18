package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExportRevisionDestinationEntry extends StObject {
  
  /**
    * The S3 bucket that is the destination for the event action.
    */
  var Bucket: string
  
  /**
    * A string representing the pattern for generated names of the individual assets in the revision. For more information about key patterns, see Key patterns when exporting revisions.
    */
  var KeyPattern: js.UndefOr[string] = js.undefined
}
object AutoExportRevisionDestinationEntry {
  
  inline def apply(Bucket: string): AutoExportRevisionDestinationEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoExportRevisionDestinationEntry]
  }
  
  extension [Self <: AutoExportRevisionDestinationEntry](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPattern(value: string): Self = StObject.set(x, "KeyPattern", value.asInstanceOf[js.Any])
    
    inline def setKeyPatternUndefined: Self = StObject.set(x, "KeyPattern", js.undefined)
  }
}
