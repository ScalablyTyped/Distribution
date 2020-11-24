package typings.activexLibreoffice.com_.sun.star.xml.xpath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Libxml2ExtensionHandle extends js.Object {
  
  var functionData: Double = js.native
  
  var functionLookupFunction: Double = js.native
  
  var variableData: Double = js.native
  
  var variableLookupFunction: Double = js.native
}
object Libxml2ExtensionHandle {
  
  @scala.inline
  def apply(
    functionData: Double,
    functionLookupFunction: Double,
    variableData: Double,
    variableLookupFunction: Double
  ): Libxml2ExtensionHandle = {
    val __obj = js.Dynamic.literal(functionData = functionData.asInstanceOf[js.Any], functionLookupFunction = functionLookupFunction.asInstanceOf[js.Any], variableData = variableData.asInstanceOf[js.Any], variableLookupFunction = variableLookupFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libxml2ExtensionHandle]
  }
  
  @scala.inline
  implicit class Libxml2ExtensionHandleOps[Self <: Libxml2ExtensionHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctionData(value: Double): Self = this.set("functionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionLookupFunction(value: Double): Self = this.set("functionLookupFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableData(value: Double): Self = this.set("variableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableLookupFunction(value: Double): Self = this.set("variableLookupFunction", value.asInstanceOf[js.Any])
  }
}
