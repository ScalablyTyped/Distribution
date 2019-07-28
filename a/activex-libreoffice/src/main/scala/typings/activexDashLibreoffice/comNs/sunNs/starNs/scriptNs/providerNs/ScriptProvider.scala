package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XIntrospectionAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.browseNs.BrowseNode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.browseNs.XBrowseNode
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service providers a means to browse and execute scripts. */
trait ScriptProvider
  extends BrowseNode
     with XScriptProvider

object ScriptProvider {
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
    getScript: String => XScript,
    getType: () => Double,
    getValue: String => js.Any,
    hasChildNodes: () => Boolean,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValue: (String, js.Any) => Unit
  ): ScriptProvider = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Introspection = Introspection, Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getScript = js.Any.fromFunction1(getScript), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[ScriptProvider]
  }
}

