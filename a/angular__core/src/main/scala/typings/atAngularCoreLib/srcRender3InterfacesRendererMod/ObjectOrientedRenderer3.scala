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
    createComment: js.Function1[java.lang.String, RComment],
    createElement: js.Function1[java.lang.String, RElement],
    createElementNS: js.Function2[java.lang.String, java.lang.String, RElement],
    createTextNode: js.Function1[java.lang.String, RText],
    querySelector: js.Function1[java.lang.String, RElement | scala.Null]
  ): ObjectOrientedRenderer3 = {
    val __obj = js.Dynamic.literal(createComment = createComment, createElement = createElement, createElementNS = createElementNS, createTextNode = createTextNode, querySelector = querySelector)
  
    __obj.asInstanceOf[ObjectOrientedRenderer3]
  }
}

