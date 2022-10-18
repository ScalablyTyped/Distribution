package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlList extends StObject {
  
  /**
    * Specifies whether the ACL grants the general public with read access permissions for the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the ACL grants the general public with write access permissions for the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.undefined
}
object AccessControlList {
  
  inline def apply(): AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlList]
  }
  
  extension [Self <: AccessControlList](x: Self) {
    
    inline def setAllowsPublicReadAccess(value: boolean): Self = StObject.set(x, "allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "allowsPublicReadAccess", js.undefined)
    
    inline def setAllowsPublicWriteAccess(value: boolean): Self = StObject.set(x, "allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "allowsPublicWriteAccess", js.undefined)
  }
}
