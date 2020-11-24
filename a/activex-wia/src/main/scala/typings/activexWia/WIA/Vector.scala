package typings.activexWia.WIA

import typings.std.SafeArray
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Vector object is a collection of values of the same type. It is used throughout the library in many different ways. The Vector object may be
  * created using "WIA.Vector" in a call to CreateObject.
  */
@js.native
trait Vector[TItem] extends js.Object {
  
  /** Returns the specified item in the vector by position */
  def apply(Index: Double): TItem = js.native
  
  /**
    * If Index is not zero, Inserts a new element into the Vector collection before the specified Index. If Index is zero, Appends a new element to the
    * Vector collection.
    * @param number [Index=0]
    */
  def Add(Value: TItem): Unit = js.native
  def Add(Value: TItem, Index: Double): Unit = js.native
  
  /** Returns/Sets the Vector of Bytes as an array of bytes */
  var BinaryData: SafeArray[_] = js.native
  
  /** Removes all elements. */
  def Clear(): Unit = js.native
  
  /** Returns the number of members in the vector */
  val Count: Double = js.native
  
  /** Returns/Sets the Vector of Integers from a Date */
  var Date: VarDate = js.native
  
  /**
    * Used to get the Thumbnail property of an ImageFile which is an image file, The thumbnail property of an Item which is RGB data, or creating an
    * ImageFile from raw ARGB data. Returns an ImageFile object on success. See the Picture method for more details.
    * @param number [Width=0]
    * @param number [Height=0]
    */
  def ImageFile(): typings.activexWia.WIA.ImageFile = js.native
  def ImageFile(Width: js.UndefOr[scala.Nothing], Height: Double): typings.activexWia.WIA.ImageFile = js.native
  def ImageFile(Width: Double): typings.activexWia.WIA.ImageFile = js.native
  def ImageFile(Width: Double, Height: Double): typings.activexWia.WIA.ImageFile = js.native
  
  /** Returns the specified item in the vector by position */
  def Item(Index: Double): TItem = js.native
  
  /**
    * If the Vector of Bytes contains an image file, then Width and Height are ignored. Otherwise a Vector of Bytes must be RGB data and a Vector of Longs
    * must be ARGB data. Returns a Picture object on success. See the ImageFile method for more details.
    * @param number [Width=0]
    * @param number [Height=0]
    */
  def Picture(): js.Any = js.native
  def Picture(Width: js.UndefOr[scala.Nothing], Height: Double): js.Any = js.native
  def Picture(Width: Double): js.Any = js.native
  def Picture(Width: Double, Height: Double): js.Any = js.native
  
  /** Removes the designated element and returns it if successful */
  def Remove(Index: Double): TItem | Null = js.native
  
  /**
    * Stores the string Value into the Vector of Bytes including the NULL terminator. Value may be truncated unless Resizable is True. The string will be
    * stored as an ANSI string unless Unicode is True, in which case it will be stored as a Unicode string.
    * @param boolean [Resizable=true]
    * @param boolean [Unicode=true]
    */
  def SetFromString(Value: String): Unit = js.native
  def SetFromString(Value: String, Resizable: js.UndefOr[scala.Nothing], Unicode: Boolean): Unit = js.native
  def SetFromString(Value: String, Resizable: Boolean): Unit = js.native
  def SetFromString(Value: String, Resizable: Boolean, Unicode: Boolean): Unit = js.native
  
  /**
    * Returns a Vector of Bytes as a String
    * @param boolean [Unicode=true]
    */
  def String(): java.lang.String = js.native
  def String(Unicode: Boolean): java.lang.String = js.native
}
