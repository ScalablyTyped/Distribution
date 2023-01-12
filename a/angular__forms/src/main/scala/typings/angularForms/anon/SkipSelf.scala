package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipSelf extends StObject {
  
  var host: `true`
  
  var skipSelf: `true`
}
object SkipSelf {
  
  inline def apply(): SkipSelf = {
    val __obj = js.Dynamic.literal(host = true, skipSelf = true)
    __obj.asInstanceOf[SkipSelf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkipSelf] (val x: Self) extends AnyVal {
    
    inline def setHost(value: `true`): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setSkipSelf(value: `true`): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
  }
}
