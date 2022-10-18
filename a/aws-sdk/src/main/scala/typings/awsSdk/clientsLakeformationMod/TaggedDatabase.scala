package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedDatabase extends StObject {
  
  /**
    * A database that has LF-tags attached to it.
    */
  var Database: js.UndefOr[DatabaseResource] = js.undefined
  
  /**
    * A list of LF-tags attached to the database.
    */
  var LFTags: js.UndefOr[LFTagsList] = js.undefined
}
object TaggedDatabase {
  
  inline def apply(): TaggedDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedDatabase]
  }
  
  extension [Self <: TaggedDatabase](x: Self) {
    
    inline def setDatabase(value: DatabaseResource): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setLFTags(value: LFTagsList): Self = StObject.set(x, "LFTags", value.asInstanceOf[js.Any])
    
    inline def setLFTagsUndefined: Self = StObject.set(x, "LFTags", js.undefined)
    
    inline def setLFTagsVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTags", js.Array(value*))
  }
}
