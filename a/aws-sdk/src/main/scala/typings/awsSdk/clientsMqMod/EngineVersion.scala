package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineVersion extends StObject {
  
  /**
    * Id for the version.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object EngineVersion {
  
  inline def apply(): EngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EngineVersion] (val x: Self) extends AnyVal {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
