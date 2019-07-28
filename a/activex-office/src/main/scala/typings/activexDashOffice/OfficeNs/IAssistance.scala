package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IAssistance")
@js.native
class IAssistance protected () extends js.Object {
  var `Office.IAssistance_typekey`: IAssistance = js.native
  /** ClearDefaultContext Method */
  def ClearDefaultContext(HelpId: String): Unit = js.native
  /**
    * SearchHelp Method
    * @param Scope [Scope='']
    */
  def SearchHelp(Query: String): Unit = js.native
  def SearchHelp(Query: String, Scope: String): Unit = js.native
  /** SetDefaultContext Method */
  def SetDefaultContext(HelpId: String): Unit = js.native
  /**
    * ShowHelp Method
    * @param HelpId [HelpId='']
    * @param Scope [Scope='']
    */
  def ShowHelp(): Unit = js.native
  def ShowHelp(HelpId: String): Unit = js.native
  def ShowHelp(HelpId: String, Scope: String): Unit = js.native
}

