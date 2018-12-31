package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IAssistance")
@js.native
class IAssistance protected () extends js.Object {
  var `Office.IAssistance_typekey`: IAssistance = js.native
  /** ClearDefaultContext Method */
  def ClearDefaultContext(HelpId: java.lang.String): scala.Unit = js.native
  /**
    * SearchHelp Method
    * @param Scope [Scope='']
    */
  def SearchHelp(Query: java.lang.String): scala.Unit = js.native
  def SearchHelp(Query: java.lang.String, Scope: java.lang.String): scala.Unit = js.native
  /** SetDefaultContext Method */
  def SetDefaultContext(HelpId: java.lang.String): scala.Unit = js.native
  /**
    * ShowHelp Method
    * @param HelpId [HelpId='']
    * @param Scope [Scope='']
    */
  def ShowHelp(): scala.Unit = js.native
  def ShowHelp(HelpId: java.lang.String): scala.Unit = js.native
  def ShowHelp(HelpId: java.lang.String, Scope: java.lang.String): scala.Unit = js.native
}

