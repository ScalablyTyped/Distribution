package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDevices Class */
@js.native
trait FaxDevices extends js.Object {
  
  def apply(vIndex: js.Any): FaxDevice = js.native
  
  val Count: Double = js.native
  
  def Item(vIndex: js.Any): FaxDevice = js.native
  
  /** Get device by its ID */
  def ItemById(lId: Double): FaxDevice = js.native
}
