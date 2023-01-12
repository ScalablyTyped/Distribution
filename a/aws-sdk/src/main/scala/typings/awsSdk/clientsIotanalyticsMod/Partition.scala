package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partition extends StObject {
  
  /**
    *  The name of the attribute that defines a partition dimension. 
    */
  var attributeName: PartitionAttributeName
}
object Partition {
  
  inline def apply(attributeName: PartitionAttributeName): Partition = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partition] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: PartitionAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
  }
}
