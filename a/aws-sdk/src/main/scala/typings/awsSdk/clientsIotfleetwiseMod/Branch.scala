package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branch extends StObject {
  
  /**
    * A brief description of the branch.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The fully qualified name of the branch. For example, the fully qualified name of a branch might be Vehicle.Body.Engine.
    */
  var fullyQualifiedName: java.lang.String
}
object Branch {
  
  inline def apply(fullyQualifiedName: java.lang.String): Branch = {
    val __obj = js.Dynamic.literal(fullyQualifiedName = fullyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullyQualifiedName(value: java.lang.String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
  }
}
