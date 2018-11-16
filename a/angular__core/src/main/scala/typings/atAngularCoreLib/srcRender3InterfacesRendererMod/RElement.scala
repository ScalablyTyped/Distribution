package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RElement extends RNode {
  var classList: RDomTokenList = js.native
  var className: java.lang.String = js.native
  var setProperty: js.UndefOr[js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]] = js.native
  var style: RCssStyleDeclaration = js.native
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListener, useCapture: scala.Boolean): scala.Unit = js.native
  def removeAttribute(name: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListener, options: scala.Boolean): scala.Unit = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

