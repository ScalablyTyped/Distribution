package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageSystemListEntry extends StObject {
  
  /**
    * The name of an on-premises storage system that you added to DataSync Discovery.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Name] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
    */
  var StorageSystemArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.StorageSystemArn] = js.undefined
}
object StorageSystemListEntry {
  
  inline def apply(): StorageSystemListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageSystemListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageSystemListEntry] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemArnUndefined: Self = StObject.set(x, "StorageSystemArn", js.undefined)
  }
}
