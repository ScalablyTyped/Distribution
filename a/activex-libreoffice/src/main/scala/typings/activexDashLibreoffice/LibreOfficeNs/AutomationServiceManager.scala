package typings.activexDashLibreoffice.LibreOfficeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationServiceManager extends ServiceManager {
  var defaultContext: AutomationScriptContext = js.native
  def Bridge_GetStruct[K /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 388 */ js.Any */](structName: K): /* import warning: ImportType.apply Failed type conversion: activex-libreoffice.LibreOffice.StructNameMap[K] */ js.Any = js.native
  /**
    * Returns a Value Object, for explicitly specifying the types of values passed into the UNO API
    * Can also be used for `out` and `inout` parameters
    */
  def Bridge_GetValueObject(): Unit = js.native
}

