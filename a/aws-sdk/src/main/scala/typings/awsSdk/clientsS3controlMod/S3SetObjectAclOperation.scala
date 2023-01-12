package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SetObjectAclOperation extends StObject {
  
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.undefined
}
object S3SetObjectAclOperation {
  
  inline def apply(): S3SetObjectAclOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectAclOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3SetObjectAclOperation] (val x: Self) extends AnyVal {
    
    inline def setAccessControlPolicy(value: S3AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
  }
}
