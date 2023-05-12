package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLambdaAccessPointAlias extends StObject {
  
  /**
    * The status of the Object Lambda Access Point alias. If the status is PROVISIONING, the Object Lambda Access Point is provisioning the alias and the alias is not ready for use yet. If the status is READY, the Object Lambda Access Point alias is successfully provisioned and ready for use.
    */
  var Status: js.UndefOr[ObjectLambdaAccessPointAliasStatus] = js.undefined
  
  /**
    * The alias value of the Object Lambda Access Point.
    */
  var Value: js.UndefOr[ObjectLambdaAccessPointAliasValue] = js.undefined
}
object ObjectLambdaAccessPointAlias {
  
  inline def apply(): ObjectLambdaAccessPointAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLambdaAccessPointAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLambdaAccessPointAlias] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ObjectLambdaAccessPointAliasStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValue(value: ObjectLambdaAccessPointAliasValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
