package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  /**
    * When true, this Boolean value indicates the primary session for the specified resource.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The session name.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The session URL.
    */
  var url: js.UndefOr[SensitiveNonEmptyString] = js.undefined
}
object Session {
  
  inline def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: SensitiveNonEmptyString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
