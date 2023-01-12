package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Release extends StObject {
  
  var account: Data
  
  var release: DataIdType
}
object Release {
  
  inline def apply(account: Data, release: DataIdType): Release = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Release] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Data): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: DataIdType): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
