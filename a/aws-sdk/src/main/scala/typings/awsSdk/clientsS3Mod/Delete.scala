package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  /**
    * The objects to delete.
    */
  var Objects: ObjectIdentifierList
  
  /**
    * Element to enable quiet mode for the request. When you add this element, you must set its value to true.
    */
  var Quiet: js.UndefOr[typings.awsSdk.clientsS3Mod.Quiet] = js.undefined
}
object Delete {
  
  inline def apply(Objects: ObjectIdentifierList): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setObjects(value: ObjectIdentifierList): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value*))
    
    inline def setQuiet(value: Quiet): Self = StObject.set(x, "Quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "Quiet", js.undefined)
  }
}
