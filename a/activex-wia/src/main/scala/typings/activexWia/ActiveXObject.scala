package typings.activexWia

import typings.activexWia.WIA.DeviceManager
import typings.activexWia.WIA.Vector
import typings.activexWia.activexWiaStrings.DeviceID
import typings.activexWia.activexWiaStrings.EventID
import typings.activexWia.activexWiaStrings.Item
import typings.activexWia.activexWiaStrings.ItemID
import typings.activexWia.activexWiaStrings.OnEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: DeviceManager,
    event: OnEvent,
    argNames: js.Tuple3[EventID, DeviceID, ItemID],
    handler: js.ThisFunction1[/* this */ DeviceManager, /* parameter */ typings.activexWia.anon.DeviceID, Unit]
  ): Unit
  
  @JSName("set")
  def set_Item[TItem](obj: Vector[TItem], propertyName: Item, parameterTypes: js.Array[Double], newValue: TItem): Unit
}
object ActiveXObject {
  
  inline def apply(
    on: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ typings.activexWia.anon.DeviceID, Unit]) => Unit,
    set: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on), set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setOn(
      value: (DeviceManager, OnEvent, js.Tuple3[EventID, DeviceID, ItemID], js.ThisFunction1[/* this */ DeviceManager, /* parameter */ typings.activexWia.anon.DeviceID, Unit]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
    
    inline def setSet(value: (Vector[js.Any], Item, js.Array[Double], js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
  }
}
