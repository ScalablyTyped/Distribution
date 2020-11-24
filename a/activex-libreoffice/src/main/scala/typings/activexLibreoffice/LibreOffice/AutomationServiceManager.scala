package typings.activexLibreoffice.LibreOffice

import typings.activexLibreoffice.com_.sun.star.lang.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomationServiceManager extends ServiceManager {
  
  def Bridge_GetStruct[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any */](structName: K): /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.StructNameMap[K] */ js.Any = js.native
  
  /**
    * Returns a Value Object, for explicitly specifying the types of values passed into the UNO API
    * Can also be used for `out` and `inout` parameters
    */
  def Bridge_GetValueObject(): Unit = js.native
  
  var defaultContext: AutomationScriptContext = js.native
}
