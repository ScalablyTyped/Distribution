package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eula extends StObject {
  
  /**
    * The EULA content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The EULA ID.
    */
  var eulaId: js.UndefOr[EulaId] = js.undefined
  
  /**
    * The name for the EULA.
    */
  var name: js.UndefOr[EulaName] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Eula {
  
  inline def apply(): Eula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eula]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eula] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEulaId(value: EulaId): Self = StObject.set(x, "eulaId", value.asInstanceOf[js.Any])
    
    inline def setEulaIdUndefined: Self = StObject.set(x, "eulaId", js.undefined)
    
    inline def setName(value: EulaName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
