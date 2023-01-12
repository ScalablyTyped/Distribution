package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetContentDeliveryRule extends StObject {
  
  /**
    * The destination to which dataset contents are delivered.
    */
  var destination: DatasetContentDeliveryDestination
  
  /**
    * The name of the dataset content delivery rules entry.
    */
  var entryName: js.UndefOr[EntryName] = js.undefined
}
object DatasetContentDeliveryRule {
  
  inline def apply(destination: DatasetContentDeliveryDestination): DatasetContentDeliveryRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentDeliveryRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetContentDeliveryRule] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: DatasetContentDeliveryDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setEntryName(value: EntryName): Self = StObject.set(x, "entryName", value.asInstanceOf[js.Any])
    
    inline def setEntryNameUndefined: Self = StObject.set(x, "entryName", js.undefined)
  }
}
