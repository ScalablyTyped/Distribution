package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stores extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Stores_typekey")
  var OutlookDotStores_typekey: Stores
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): Store
}

object Stores {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Store,
    OutlookDotStores_typekey: Stores,
    Parent: js.Any,
    Session: NameSpace
  ): Stores = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Stores_typekey")(OutlookDotStores_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stores]
  }
}

