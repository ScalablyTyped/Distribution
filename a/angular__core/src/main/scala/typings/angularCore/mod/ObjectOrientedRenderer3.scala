package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object Oriented style of API needed to create elements and text nodes.
  *
  * This is the native browser API style, e.g. operations are methods on individual objects
  * like HTMLElement. With this style, no additional code is needed as a facade
  * (reducing payload size).
  * */
trait ObjectOrientedRenderer3 extends Renderer3 {
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
}

