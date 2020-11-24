package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhanceInstruction extends js.Object {
  
  /**
    * A binding context for the enhancement.
    */
  var bindingContext: js.UndefOr[js.Object] = js.native
  
  /**
    * The DI container to use as the root for UI enhancement.
    */
  var container: js.UndefOr[Container] = js.native
  
  /**
    * The element to enhance.
    */
  var element: Element = js.native
  
  /**
    * A secondary binding context that can override the standard context.
    */
  var overrideContext: js.UndefOr[js.Any] = js.native
  
  /**
    * The resources available for enhancement.
    */
  var resources: js.UndefOr[ViewResources_] = js.native
}
object EnhanceInstruction {
  
  @scala.inline
  def apply(element: Element): EnhanceInstruction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceInstruction]
  }
  
  @scala.inline
  implicit class EnhanceInstructionOps[Self <: EnhanceInstruction] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingContext(value: js.Object): Self = this.set("bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingContext: Self = this.set("bindingContext", js.undefined)
    
    @scala.inline
    def setContainer(value: Container): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setOverrideContext(value: js.Any): Self = this.set("overrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideContext: Self = this.set("overrideContext", js.undefined)
    
    @scala.inline
    def setResources(value: ViewResources_): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
