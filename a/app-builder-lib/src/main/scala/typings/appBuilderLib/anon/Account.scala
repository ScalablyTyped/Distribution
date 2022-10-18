package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var account: Data
  
  var release: DataType
}
object Account {
  
  inline def apply(account: Data, release: DataType): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccount(value: Data): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: DataType): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
