package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleInfo extends StObject {
  
  /**
    * A concatenated list of the logical IDs of the module or modules containing the resource. Modules are listed starting with the inner-most nested module, and separated by /. In the following example, the resource was created from a module, moduleA, that's nested inside a parent module, moduleB.  moduleA/moduleB  For more information, see Referencing resources in a module in the CloudFormation User Guide.
    */
  var LogicalIdHierarchy: js.UndefOr[typings.awsSdk.clientsCloudformationMod.LogicalIdHierarchy] = js.undefined
  
  /**
    * A concatenated list of the module type or types containing the resource. Module types are listed starting with the inner-most nested module, and separated by /. In the following example, the resource was created from a module of type AWS::First::Example::MODULE, that's nested inside a parent module of type AWS::Second::Example::MODULE.  AWS::First::Example::MODULE/AWS::Second::Example::MODULE 
    */
  var TypeHierarchy: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeHierarchy] = js.undefined
}
object ModuleInfo {
  
  inline def apply(): ModuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleInfo]
  }
  
  extension [Self <: ModuleInfo](x: Self) {
    
    inline def setLogicalIdHierarchy(value: LogicalIdHierarchy): Self = StObject.set(x, "LogicalIdHierarchy", value.asInstanceOf[js.Any])
    
    inline def setLogicalIdHierarchyUndefined: Self = StObject.set(x, "LogicalIdHierarchy", js.undefined)
    
    inline def setTypeHierarchy(value: TypeHierarchy): Self = StObject.set(x, "TypeHierarchy", value.asInstanceOf[js.Any])
    
    inline def setTypeHierarchyUndefined: Self = StObject.set(x, "TypeHierarchy", js.undefined)
  }
}
