package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.XInvocation

object BrowseNode {
  @scala.inline
  def apply(
    ChildNodes: stdLib.SafeArray[XBrowseNode],
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    Name: java.lang.String,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getChildNodes: () => stdLib.SafeArray[XBrowseNode],
    getIntrospection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    getName: () => java.lang.String,
    getType: () => scala.Double,
    getValue: java.lang.String => js.Any,
    hasChildNodes: () => scala.Boolean,
    hasMethod: java.lang.String => scala.Boolean,
    hasProperty: java.lang.String => scala.Boolean,
    invoke: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValue: (java.lang.String, js.Any) => scala.Unit
  ): BrowseNode = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Introspection = Introspection, Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[BrowseNode]
  }
}

