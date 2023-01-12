package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactGetItem extends StObject {
  
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
    */
  var Get: typings.awsSdk.clientsDynamodbMod.Get
}
object TransactGetItem {
  
  inline def apply(Get: Get): TransactGetItem = {
    val __obj = js.Dynamic.literal(Get = Get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactGetItem] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Get): Self = StObject.set(x, "Get", value.asInstanceOf[js.Any])
  }
}
