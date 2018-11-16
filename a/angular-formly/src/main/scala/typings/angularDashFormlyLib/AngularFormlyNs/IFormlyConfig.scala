package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormlyConfig extends js.Object {
  var disableWarnings: scala.Boolean = js.native
  var extras: IFormlyConfigExtras = js.native
  var templateManipulators: ITemplateManipulators = js.native
  def setType(typeOptions: ITypeOptions): scala.Unit = js.native
  def setWrapper(wrapperOptions: IWrapperOptions): scala.Unit = js.native
  def setWrapper(wrapperOptions: js.Array[IWrapperOptions]): scala.Unit = js.native
}

