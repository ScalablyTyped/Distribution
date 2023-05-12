package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagQueryConfiguration extends StObject {
  
  /**
    *  Condition in the IAM policy that associates resources to an application. 
    */
  var tagKey: js.UndefOr[TagKeyConfig] = js.undefined
}
object TagQueryConfiguration {
  
  inline def apply(): TagQueryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagQueryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagQueryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTagKey(value: TagKeyConfig): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
  }
}
