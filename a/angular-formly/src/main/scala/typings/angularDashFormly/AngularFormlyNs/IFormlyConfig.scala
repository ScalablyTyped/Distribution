package typings.angularDashFormly.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormlyConfig extends js.Object {
  var disableWarnings: Boolean = js.native
  var extras: IFormlyConfigExtras = js.native
  var templateManipulators: ITemplateManipulators = js.native
  def setType(typeOptions: ITypeOptions): Unit = js.native
  def setWrapper(wrapperOptions: js.Array[IWrapperOptions]): Unit = js.native
  def setWrapper(wrapperOptions: IWrapperOptions): Unit = js.native
}

