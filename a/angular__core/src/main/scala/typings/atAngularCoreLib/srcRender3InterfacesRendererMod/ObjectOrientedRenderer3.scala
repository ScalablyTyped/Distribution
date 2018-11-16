package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectOrientedRenderer3 extends js.Object {
  def createComment(data: java.lang.String): RComment
  def createElement(tagName: java.lang.String): RElement
  def createElementNS(namespace: java.lang.String, tagName: java.lang.String): RElement
  def createTextNode(data: java.lang.String): RText
  def querySelector(selectors: java.lang.String): RElement | scala.Null
}

