package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Item object is a container for an item on an imaging device object. See the Items property on the Device or Item object for details on accessing
  * Item objects.
  */
@js.native
trait Item extends js.Object {
  /** A collection of all commands for this item */
  @JSName("Commands")
  val Commands_Original: DeviceCommands = js.native
  /** A collection of all supported format types for this item */
  @JSName("Formats")
  val Formats_Original: Formats = js.native
  /** Returns the ItemID for this Item */
  val ItemID: String = js.native
  /** A collection of all child items for this item */
  @JSName("Items")
  val Items_Original: Items = js.native
  /** A collection of all properties for this item */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("WIA.Item_typekey")
  var WIADotItem_typekey: Item = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all commands for this item */
  def Commands(Index: Double): DeviceCommand = js.native
  /** Issues the command specified by CommandID. CommandIDs are device dependent. Valid CommandIDs for this Item are contained in the Commands collection. */
  def ExecuteCommand(CommandID: String): Item = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all supported format types for this item */
  def Formats(Index: Double): String = js.native
  /** Returns the specified item in the collection by position */
  /** A collection of all child items for this item */
  def Items(Index: Double): Item = js.native
  def Properties(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this item */
  def Properties(Index: Double): Property = js.native
  /**
    * Returns an ImageFile object, in this version, in the format specified in FormatID if supported, otherwise using the preferred format for this imaging
    * device. Future versions may return a collection of ImageFile objects.
    * @param string [FormatID='{00000000-0000-0000-0000-000000000000}']
    */
  def Transfer(): ImageFile = js.native
  def Transfer(FormatID: String): ImageFile = js.native
}

