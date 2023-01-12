package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionKey extends StObject {
  
  /**
    * The name(s) of the partition key column(s).
    */
  var name: GenericString
}
object PartitionKey {
  
  inline def apply(name: GenericString): PartitionKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionKey] (val x: Self) extends AnyVal {
    
    inline def setName(value: GenericString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
