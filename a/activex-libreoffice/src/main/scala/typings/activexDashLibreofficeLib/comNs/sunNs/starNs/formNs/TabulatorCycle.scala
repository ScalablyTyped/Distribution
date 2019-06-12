package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies how the TAB key should be used in a form.
  *
  * If the last control of a form is focused, and the user pressed the TAB key, there are several possibilities how a {@link FormController} should handle
  * this. TabulatorCycle specifies these possibilities.
  *
  * Note that the TabulatorCycle determines what happens when SHIFT-TAB is pressed on the **first** control of a form, as well as when TAB is pressed on
  * the **last** control.
  *
  * **First** and **last** refers to the tabbing order of controls.
  * @see FormControlModel.TabIndex
  * @see FormController
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait TabulatorCycle extends js.Object

