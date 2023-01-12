package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachObject extends StObject {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.BatchReferenceName] = js.undefined
  
  /**
    * The name of the link.
    */
  var LinkName: typings.awsSdk.clientsClouddirectoryMod.LinkName
  
  /**
    * Parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference
}
object BatchDetachObject {
  
  inline def apply(LinkName: LinkName, ParentReference: ObjectReference): BatchDetachObject = {
    val __obj = js.Dynamic.literal(LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetachObject] (val x: Self) extends AnyVal {
    
    inline def setBatchReferenceName(value: BatchReferenceName): Self = StObject.set(x, "BatchReferenceName", value.asInstanceOf[js.Any])
    
    inline def setBatchReferenceNameUndefined: Self = StObject.set(x, "BatchReferenceName", js.undefined)
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}
