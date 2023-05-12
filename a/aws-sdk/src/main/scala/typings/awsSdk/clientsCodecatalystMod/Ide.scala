package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ide extends StObject {
  
  /**
    * The name of the IDE.
    */
  var name: js.UndefOr[IdeNameString] = js.undefined
  
  /**
    * A link to the IDE runtime image.
    */
  var runtime: js.UndefOr[IdeRuntimeString] = js.undefined
}
object Ide {
  
  inline def apply(): Ide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ide] (val x: Self) extends AnyVal {
    
    inline def setName(value: IdeNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRuntime(value: IdeRuntimeString): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
