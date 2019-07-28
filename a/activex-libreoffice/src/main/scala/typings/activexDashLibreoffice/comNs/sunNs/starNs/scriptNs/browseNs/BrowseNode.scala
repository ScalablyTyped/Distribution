package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.browseNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XIntrospectionAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.XInvocation
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service provides access to the Macros and Macro containers via the {@link XBrowseNode} interface. {@link XInvocation} is an optional interface
  * that is used to execute macros, or to create/delete/rename macros or macro containers.
  * @since OOo 2.0
  */
trait BrowseNode
  extends XBrowseNode
     with XInvocation

object BrowseNode {
  @scala.inline
  def apply(
    ChildNodes: SafeArray[XBrowseNode],
    Introspection: XIntrospectionAccess,
    Name: String,
    Type: Double,
    acquire: () => Unit,
    getChildNodes: () => SafeArray[XBrowseNode],
    getIntrospection: () => XIntrospectionAccess,
    getName: () => String,
    getType: () => Double,
    getValue: String => js.Any,
    hasChildNodes: () => Boolean,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): BrowseNode = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Introspection = Introspection, Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[BrowseNode]
  }
}

