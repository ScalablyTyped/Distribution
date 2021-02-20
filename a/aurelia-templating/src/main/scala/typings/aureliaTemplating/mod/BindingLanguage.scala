package typings.aureliaTemplating.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "BindingLanguage")
@js.native
class BindingLanguage () extends StObject {
  
  /**
    * Creates an attribute behavior instruction.
    * @param resources The ViewResources for the view being compiled.
    * @param element The element that the attribute is defined on.
    * @param info The info object previously returned from inspectAttribute.
    * @param existingInstruction A previously created instruction for this attribute.
    * @return The instruction instance.
    */
  def createAttributeInstruction(resources: ViewResources_, element: Element, info: js.Object): BehaviorInstruction = js.native
  def createAttributeInstruction(resources: ViewResources_, element: Element, info: js.Object, existingInstruction: js.Object): BehaviorInstruction = js.native
  
  /**
    * Creates let expressions from a <let/> element
    * @param resources The ViewResources for the view being compiled
    * @param element the let element in the view template
    * @param existingExpressions the array that will hold compiled let expressions from the let element
    * @return the expression array created from the <let/> element
    */
  def createLetExpressions(resources: ViewResources_, element: Element): js.Array[LetExpression] = js.native
  
  /**
    * Inspects an attribute for bindings.
    * @param resources The ViewResources for the view being compiled.
    * @param elementName The element name to inspect.
    * @param attrName The attribute name to inspect.
    * @param attrValue The attribute value to inspect.
    * @return An info object with the results of the inspection.
    */
  def inspectAttribute(resources: ViewResources_, elementName: String, attrName: String, attrValue: String): js.Object = js.native
  
  /**
    * Parses the text for bindings.
    * @param resources The ViewResources for the view being compiled.
    * @param value The value of the text to parse.
    * @return A binding expression.
    */
  def inspectTextContent(resources: ViewResources_, value: String): js.Object = js.native
}
