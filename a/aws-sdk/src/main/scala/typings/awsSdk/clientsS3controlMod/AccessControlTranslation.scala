package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlTranslation extends StObject {
  
  /**
    * Specifies the replica ownership.
    */
  var Owner: OwnerOverride
}
object AccessControlTranslation {
  
  inline def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlTranslation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessControlTranslation] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: OwnerOverride): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
