package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Properties object is a collection of all the Property objects associated with a given Device, DeviceInfo, Filter, ImageFile or Item object. See
  * the Properties property on any of these objects for detail on accessing the Properties object.
  */
@js.native
trait Properties extends StObject {
  
  def apply(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  def apply(Index: Double): Property = js.native
  
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  
  def Exists(Index: String): Boolean = js.native
  /** Indicates whether the specified Property exists in the collection */
  def Exists(Index: Double): Boolean = js.native
  
  def Item(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  def Item(Index: Double): Property = js.native
}
