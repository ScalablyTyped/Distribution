package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesLimit extends StObject {
  
  /**
    * The number of Amazon S3 files to select.
    */
  var MaxFiles: typings.awsSdk.clientsDatabrewMod.MaxFiles
  
  /**
    * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most recent files are selected first. Another possible value is ASCENDING.
    */
  var Order: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Order] = js.undefined
  
  /**
    * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed value.
    */
  var OrderedBy: js.UndefOr[typings.awsSdk.clientsDatabrewMod.OrderedBy] = js.undefined
}
object FilesLimit {
  
  inline def apply(MaxFiles: MaxFiles): FilesLimit = {
    val __obj = js.Dynamic.literal(MaxFiles = MaxFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesLimit]
  }
  
  extension [Self <: FilesLimit](x: Self) {
    
    inline def setMaxFiles(value: MaxFiles): Self = StObject.set(x, "MaxFiles", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    inline def setOrderedBy(value: OrderedBy): Self = StObject.set(x, "OrderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderedByUndefined: Self = StObject.set(x, "OrderedBy", js.undefined)
  }
}
