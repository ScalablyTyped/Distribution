package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteObject extends StObject {
  
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object BatchDeleteObject {
  
  inline def apply(ObjectReference: ObjectReference): BatchDeleteObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteObject]
  }
  
  extension [Self <: BatchDeleteObject](x: Self) {
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
