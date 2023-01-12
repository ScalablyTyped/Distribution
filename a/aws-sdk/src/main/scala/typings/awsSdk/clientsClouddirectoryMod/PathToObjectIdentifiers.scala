package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathToObjectIdentifiers extends StObject {
  
  /**
    * Lists ObjectIdentifiers starting from directory root to the object in the request.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
  
  /**
    * The path that is used to identify the object starting from directory root.
    */
  var Path: js.UndefOr[PathString] = js.undefined
}
object PathToObjectIdentifiers {
  
  inline def apply(): PathToObjectIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToObjectIdentifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathToObjectIdentifiers] (val x: Self) extends AnyVal {
    
    inline def setObjectIdentifiers(value: ObjectIdentifierList): Self = StObject.set(x, "ObjectIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifiersUndefined: Self = StObject.set(x, "ObjectIdentifiers", js.undefined)
    
    inline def setObjectIdentifiersVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "ObjectIdentifiers", js.Array(value*))
    
    inline def setPath(value: PathString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
