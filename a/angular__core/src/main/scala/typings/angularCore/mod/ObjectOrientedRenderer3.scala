package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object Oriented style of API needed to create elements and text nodes.
  *
  * This is the native browser API style, e.g. operations are methods on individual objects
  * like HTMLElement. With this style, no additional code is needed as a facade
  * (reducing payload size).
  * */
trait ObjectOrientedRenderer3
  extends StObject
     with Renderer3 {
  
  def createComment(data: String): RComment
  
  def createElement(tagName: String): RElement
  
  def createElementNS(namespace: String, tagName: String): RElement
  
  def createTextNode(data: String): RText
  
  def querySelector(selectors: String): RElement | Null
}
object ObjectOrientedRenderer3 {
  
  @scala.inline
  def apply(
    createComment: String => RComment,
    createElement: String => RElement,
    createElementNS: (String, String) => RElement,
    createTextNode: String => RText,
    querySelector: String => RElement | Null
  ): ObjectOrientedRenderer3 = {
    val __obj = js.Dynamic.literal(createComment = js.Any.fromFunction1(createComment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createTextNode = js.Any.fromFunction1(createTextNode), querySelector = js.Any.fromFunction1(querySelector))
    __obj.asInstanceOf[ObjectOrientedRenderer3]
  }
  
  @scala.inline
  implicit class ObjectOrientedRenderer3MutableBuilder[Self <: ObjectOrientedRenderer3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateComment(value: String => RComment): Self = StObject.set(x, "createComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElement(value: String => RElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementNS(value: (String, String) => RElement): Self = StObject.set(x, "createElementNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextNode(value: String => RText): Self = StObject.set(x, "createTextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelector(value: String => RElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
  }
}
