package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginAccessControl extends StObject {
  
  /**
    * The unique identifier of the origin access control.
    */
  var Id: String
  
  /**
    * The origin access control.
    */
  var OriginAccessControlConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.OriginAccessControlConfig] = js.undefined
}
object OriginAccessControl {
  
  inline def apply(Id: String): OriginAccessControl = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginAccessControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginAccessControl] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlConfig(value: OriginAccessControlConfig): Self = StObject.set(x, "OriginAccessControlConfig", value.asInstanceOf[js.Any])
    
    inline def setOriginAccessControlConfigUndefined: Self = StObject.set(x, "OriginAccessControlConfig", js.undefined)
  }
}
