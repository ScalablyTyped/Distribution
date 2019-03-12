package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOrientedRenderer3 extends Renderer3 {
  def createComment(data: java.lang.String): RComment
  def createElement(tagName: java.lang.String): RElement
  def createElementNS(namespace: java.lang.String, tagName: java.lang.String): RElement
  def createTextNode(data: java.lang.String): RText
  def querySelector(selectors: java.lang.String): RElement | scala.Null
}

object ObjectOrientedRenderer3 {
  @scala.inline
  def apply(
    createComment: java.lang.String => RComment,
    createElement: java.lang.String => RElement,
    createElementNS: (java.lang.String, java.lang.String) => RElement,
    createTextNode: java.lang.String => RText,
    querySelector: java.lang.String => RElement | scala.Null
  ): ObjectOrientedRenderer3 = {
    val __obj = js.Dynamic.literal(createComment = js.Any.fromFunction1(createComment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createTextNode = js.Any.fromFunction1(createTextNode), querySelector = js.Any.fromFunction1(querySelector))
  
    __obj.asInstanceOf[ObjectOrientedRenderer3]
  }
}

