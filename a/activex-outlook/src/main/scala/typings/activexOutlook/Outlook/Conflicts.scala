package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflicts extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Conflicts_typekey")
  var OutlookDotConflicts_typekey: Conflicts
  val Parent: js.Any
  val Session: NameSpace
  def GetFirst(): Conflict
  def GetLast(): Conflict
  def GetNext(): Conflict
  def GetPrevious(): Conflict
  def Item(Index: js.Any): Conflict
}

object Conflicts {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetFirst: () => Conflict,
    GetLast: () => Conflict,
    GetNext: () => Conflict,
    GetPrevious: () => Conflict,
    Item: js.Any => Conflict,
    OutlookDotConflicts_typekey: Conflicts,
    Parent: js.Any,
    Session: NameSpace
  ): Conflicts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetFirst = js.Any.fromFunction0(GetFirst), GetLast = js.Any.fromFunction0(GetLast), GetNext = js.Any.fromFunction0(GetNext), GetPrevious = js.Any.fromFunction0(GetPrevious), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflicts_typekey")(OutlookDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
}

