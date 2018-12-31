package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Vector object is a collection of values of the same type. It is used throughout the library in many different ways. The Vector object may be
  * created using "WIA.Vector" in a call to CreateObject.
  */
@js.native
trait Vector[TItem] extends js.Object {
  /** Returns/Sets the Vector of Bytes as an array of bytes */
  var BinaryData: activexDashInteropLib.SafeArray[_] = js.native
  /** Returns the number of members in the vector */
  val Count: scala.Double = js.native
  /** Returns/Sets the Vector of Integers from a Date */
  var Date: activexDashInteropLib.VarDate = js.native
  /** Returns the specified item in the vector by position */
  def apply(Index: scala.Double): TItem = js.native
  /**
    * If Index is not zero, Inserts a new element into the Vector collection before the specified Index. If Index is zero, Appends a new element to the
    * Vector collection.
    * @param number [Index=0]
    */
  def Add(Value: TItem): scala.Unit = js.native
  def Add(Value: TItem, Index: scala.Double): scala.Unit = js.native
  /** Removes all elements. */
  def Clear(): scala.Unit = js.native
  /**
    * Used to get the Thumbnail property of an ImageFile which is an image file, The thumbnail property of an Item which is RGB data, or creating an
    * ImageFile from raw ARGB data. Returns an ImageFile object on success. See the Picture method for more details.
    * @param number [Width=0]
    * @param number [Height=0]
    */
  def ImageFile(): ImageFile = js.native
  def ImageFile(Width: scala.Double): ImageFile = js.native
  def ImageFile(Width: scala.Double, Height: scala.Double): ImageFile = js.native
  /** Returns the specified item in the vector by position */
  def Item(Index: scala.Double): TItem = js.native
  /**
    * If the Vector of Bytes contains an image file, then Width and Height are ignored. Otherwise a Vector of Bytes must be RGB data and a Vector of Longs
    * must be ARGB data. Returns a Picture object on success. See the ImageFile method for more details.
    * @param number [Width=0]
    * @param number [Height=0]
    */
  def Picture(): js.Any = js.native
  def Picture(Width: scala.Double): js.Any = js.native
  def Picture(Width: scala.Double, Height: scala.Double): js.Any = js.native
  /** Removes the designated element and returns it if successful */
  def Remove(Index: scala.Double): TItem | scala.Null = js.native
  /**
    * Stores the string Value into the Vector of Bytes including the NULL terminator. Value may be truncated unless Resizable is True. The string will be
    * stored as an ANSI string unless Unicode is True, in which case it will be stored as a Unicode string.
    * @param boolean [Resizable=true]
    * @param boolean [Unicode=true]
    */
  def SetFromString(Value: java.lang.String): scala.Unit = js.native
  def SetFromString(Value: java.lang.String, Resizable: scala.Boolean): scala.Unit = js.native
  def SetFromString(Value: java.lang.String, Resizable: scala.Boolean, Unicode: scala.Boolean): scala.Unit = js.native
  /**
    * Returns a Vector of Bytes as a String
    * @param boolean [Unicode=true]
    */
  def String(): java.lang.String = js.native
  def String(Unicode: scala.Boolean): java.lang.String = js.native
}

