package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachFromIndex extends StObject {
  
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference
  
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference
}
object BatchDetachFromIndex {
  
  inline def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchDetachFromIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachFromIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetachFromIndex] (val x: Self) extends AnyVal {
    
    inline def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}
