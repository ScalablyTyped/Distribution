package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Device object represents an active connection to an imaging device. */
trait Device extends StObject {
  
  /** Returns the specified item in the collection by position */
  /** A collection of all commands for this imaging device */
  def Commands(Index: Double): DeviceCommand
  /** A collection of all commands for this imaging device */
  @JSName("Commands")
  val Commands_Original: DeviceCommands
  
  /** Returns the DeviceID for this Device */
  val DeviceID: String
  
  /** Returns the specified item in the collection by position */
  /** A collection of all events for this imaging device */
  def Events(Index: Double): DeviceEvent
  /** A collection of all events for this imaging device */
  @JSName("Events")
  val Events_Original: DeviceEvents
  
  /**
    * Issues the command specified by CommandID to the imaging device. CommandIDs are device dependent. Valid CommandIDs for this Device are contained in
    * the Commands collection.
    */
  def ExecuteCommand(CommandID: String): Item
  
  /** Returns the Item object specified by ItemID if it exists */
  def GetItem(ItemID: String): Item
  
  /** Returns the specified item in the collection by position */
  /** A collection of all items for this imaging device */
  def Items(Index: Double): Item
  /** A collection of all items for this imaging device */
  @JSName("Items")
  val Items_Original: Items
  
  def Properties(Index: String): Property
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this imaging device */
  def Properties(Index: Double): Property
  /** A collection of all properties for this imaging device */
  @JSName("Properties")
  val Properties_Original: Properties
  
  /** Returns the Type of Device */
  val Type: WiaDeviceType
  
  /* private */ @JSName("WIA.Device_typekey")
  var WIADotDevice_typekey: Device
}
object Device {
  
  inline def apply(
    Commands: DeviceCommands,
    DeviceID: String,
    Events: DeviceEvents,
    ExecuteCommand: String => Item,
    GetItem: String => Item,
    Items: Items,
    Properties: Properties,
    Type: WiaDeviceType,
    WIADotDevice_typekey: Device
  ): Device = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any], DeviceID = DeviceID.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], ExecuteCommand = js.Any.fromFunction1(ExecuteCommand), GetItem = js.Any.fromFunction1(GetItem), Items = Items.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Device_typekey")(WIADotDevice_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: DeviceCommands): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    inline def setDeviceID(value: String): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: DeviceEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommand(value: String => Item): Self = StObject.set(x, "ExecuteCommand", js.Any.fromFunction1(value))
    
    inline def setGetItem(value: String => Item): Self = StObject.set(x, "GetItem", js.Any.fromFunction1(value))
    
    inline def setItems(value: Items): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: WiaDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWIADotDevice_typekey(value: Device): Self = StObject.set(x, "WIA.Device_typekey", value.asInstanceOf[js.Any])
  }
}
