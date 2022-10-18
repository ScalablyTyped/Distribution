package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlList extends StObject {
  
  /**
    * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether public write access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
}
object AccessControlList {
  
  inline def apply(): AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlList]
  }
  
  extension [Self <: AccessControlList](x: Self) {
    
    inline def setAllowsPublicReadAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "AllowsPublicReadAccess", js.undefined)
    
    inline def setAllowsPublicWriteAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "AllowsPublicWriteAccess", js.undefined)
  }
}
