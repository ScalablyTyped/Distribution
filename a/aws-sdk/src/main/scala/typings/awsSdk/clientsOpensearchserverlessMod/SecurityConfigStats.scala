package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigStats extends StObject {
  
  /**
    * The number of security configurations in the current account.
    */
  var SamlConfigCount: js.UndefOr[Long] = js.undefined
}
object SecurityConfigStats {
  
  inline def apply(): SecurityConfigStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityConfigStats] (val x: Self) extends AnyVal {
    
    inline def setSamlConfigCount(value: Long): Self = StObject.set(x, "SamlConfigCount", value.asInstanceOf[js.Any])
    
    inline def setSamlConfigCountUndefined: Self = StObject.set(x, "SamlConfigCount", js.undefined)
  }
}
