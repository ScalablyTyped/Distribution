package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationCollection extends StObject {
  
  /**
    *  An array of CloudFormation stack names. 
    */
  var StackNames: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.StackNames] = js.undefined
}
object CloudFormationCollection {
  
  inline def apply(): CloudFormationCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudFormationCollection] (val x: Self) extends AnyVal {
    
    inline def setStackNames(value: StackNames): Self = StObject.set(x, "StackNames", value.asInstanceOf[js.Any])
    
    inline def setStackNamesUndefined: Self = StObject.set(x, "StackNames", js.undefined)
    
    inline def setStackNamesVarargs(value: StackName*): Self = StObject.set(x, "StackNames", js.Array(value*))
  }
}
