package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateObjectAttributes extends StObject {
  
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList
  
  /**
    * Reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object BatchUpdateObjectAttributes {
  
  inline def apply(AttributeUpdates: ObjectAttributeUpdateList, ObjectReference: ObjectReference): BatchUpdateObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateObjectAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateObjectAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttributeUpdates(value: ObjectAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesVarargs(value: ObjectAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value*))
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
