package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Export extends StObject {
  
  /**
    * The stack that contains the exported output name and value.
    */
  var ExportingStackId: js.UndefOr[StackId] = js.undefined
  
  /**
    * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
    */
  var Name: js.UndefOr[ExportName] = js.undefined
  
  /**
    * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
    */
  var Value: js.UndefOr[ExportValue] = js.undefined
}
object Export {
  
  inline def apply(): Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Export]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Export] (val x: Self) extends AnyVal {
    
    inline def setExportingStackId(value: StackId): Self = StObject.set(x, "ExportingStackId", value.asInstanceOf[js.Any])
    
    inline def setExportingStackIdUndefined: Self = StObject.set(x, "ExportingStackId", js.undefined)
    
    inline def setName(value: ExportName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ExportValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
