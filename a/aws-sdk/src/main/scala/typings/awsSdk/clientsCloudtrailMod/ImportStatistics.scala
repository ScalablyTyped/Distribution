package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportStatistics extends StObject {
  
  /**
    *  The number of trail events imported into the event data store. 
    */
  var EventsCompleted: js.UndefOr[Long] = js.undefined
  
  /**
    *  The number of failed entries. 
    */
  var FailedEntries: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of log files that completed import.
    */
  var FilesCompleted: js.UndefOr[Long] = js.undefined
  
  /**
    *  The number of S3 prefixes that completed import. 
    */
  var PrefixesCompleted: js.UndefOr[Long] = js.undefined
  
  /**
    *  The number of S3 prefixes found for the import. 
    */
  var PrefixesFound: js.UndefOr[Long] = js.undefined
}
object ImportStatistics {
  
  inline def apply(): ImportStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportStatistics]
  }
  
  extension [Self <: ImportStatistics](x: Self) {
    
    inline def setEventsCompleted(value: Long): Self = StObject.set(x, "EventsCompleted", value.asInstanceOf[js.Any])
    
    inline def setEventsCompletedUndefined: Self = StObject.set(x, "EventsCompleted", js.undefined)
    
    inline def setFailedEntries(value: Long): Self = StObject.set(x, "FailedEntries", value.asInstanceOf[js.Any])
    
    inline def setFailedEntriesUndefined: Self = StObject.set(x, "FailedEntries", js.undefined)
    
    inline def setFilesCompleted(value: Long): Self = StObject.set(x, "FilesCompleted", value.asInstanceOf[js.Any])
    
    inline def setFilesCompletedUndefined: Self = StObject.set(x, "FilesCompleted", js.undefined)
    
    inline def setPrefixesCompleted(value: Long): Self = StObject.set(x, "PrefixesCompleted", value.asInstanceOf[js.Any])
    
    inline def setPrefixesCompletedUndefined: Self = StObject.set(x, "PrefixesCompleted", js.undefined)
    
    inline def setPrefixesFound(value: Long): Self = StObject.set(x, "PrefixesFound", value.asInstanceOf[js.Any])
    
    inline def setPrefixesFoundUndefined: Self = StObject.set(x, "PrefixesFound", js.undefined)
  }
}
