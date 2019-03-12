package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service providers a means to browse and execute scripts. */
trait ScriptProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNode
     with XScriptProvider

object ScriptProvider {
  @scala.inline
  def apply(
    ChildNodes: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.XBrowseNode],
    Introspection: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    Name: java.lang.String,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getChildNodes: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs.XBrowseNode],
    getIntrospection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XIntrospectionAccess,
    getName: () => java.lang.String,
    getScript: java.lang.String => XScript,
    getType: () => scala.Double,
    getValue: java.lang.String => js.Any,
    hasChildNodes: () => scala.Boolean,
    hasMethod: java.lang.String => scala.Boolean,
    hasProperty: java.lang.String => scala.Boolean,
    invoke: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValue: (java.lang.String, js.Any) => scala.Unit
  ): ScriptProvider = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Introspection = Introspection, Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getScript = js.Any.fromFunction1(getScript), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[ScriptProvider]
  }
}

