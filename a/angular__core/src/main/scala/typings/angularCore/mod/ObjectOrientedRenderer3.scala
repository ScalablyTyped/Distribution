package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object Oriented style of API needed to create elements and text nodes.
  *
  * This is the native browser API style, e.g. operations are methods on individual objects
  * like HTMLElement. With this style, no additional code is needed as a facade
  * (reducing payload size).
  * */
@js.native
trait ObjectOrientedRenderer3 extends Renderer3 {
  def createComment(data: String): RComment = js.native
  def createElement(tagName: String): RElement = js.native
  def createElementNS(namespace: String, tagName: String): RElement = js.native
  def createTextNode(data: String): RText = js.native
  def querySelector(selectors: String): RElement | Null = js.native
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
  implicit class ObjectOrientedRenderer3Ops[Self <: ObjectOrientedRenderer3] (val x: Self) extends AnyVal {
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
    def setCreateComment(value: String => RComment): Self = this.set("createComment", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateElement(value: String => RElement): Self = this.set("createElement", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateElementNS(value: (String, String) => RElement): Self = this.set("createElementNS", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateTextNode(value: String => RText): Self = this.set("createTextNode", js.Any.fromFunction1(value))
    @scala.inline
    def setQuerySelector(value: String => RElement | Null): Self = this.set("querySelector", js.Any.fromFunction1(value))
  }
  
}

