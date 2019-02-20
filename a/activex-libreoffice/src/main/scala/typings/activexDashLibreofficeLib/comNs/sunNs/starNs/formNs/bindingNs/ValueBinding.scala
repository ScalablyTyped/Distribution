package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a component which allows access to a single value
  *
  * Read/Write access to the value represented by this component is supported, as well as (optionally) active broadcasting of value changes
  */
trait ValueBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * determines whether the value is currently readonly
    *
    * For instance, you could imagine a {@link ValueBinding} which represents a cell in a spreadsheet document, and whose value is readonly as long as the
    * spreadsheet is locked.
    *
    * As long as this property is `TRUE` , the value binding should throw a {@link InvalidBindingStateException} when its {@link XValueBinding.setValue()}
    * method is invoked.
    */
  var ReadOnly: scala.Boolean
  /**
    * determines the relevance of the value represented by the binding
    *
    * In a more complex scenario, where different form controls are bound to different values, which all are part of a larger data structure, some of the
    * items in this data structure may not be relevant currently. This is indicated by the {@link Relevant} property being `FALSE` .
    *
    * XBindableValues which are bound to this binding may or may not react in certain ways on the (ir)relevance of their bound value.
    *
    * One possible reaction could be that user interface elements which are associated with the {@link XBindableValue} are disabled as long as {@link
    * Relevant} is `FALSE` .
    */
  var Relevant: scala.Boolean
}

