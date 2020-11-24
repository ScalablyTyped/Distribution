package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Filters object is a collection of the Filters that will be applied to an ImageFile when you call the Apply method on the ImageProcess object. */
@js.native
trait Filters extends js.Object {
  
  /** Returns the specified item in the collection by position or FilterID */
  def apply(Index: Double): Filter = js.native
  
  /**
    * Appends/Inserts a new Filter of the specified FilterID into a Filter collection
    * @param number [Index=0]
    */
  def Add(FilterID: String): Unit = js.native
  def Add(FilterID: String, Index: Double): Unit = js.native
  
  /** Returns the number of members in the collection */
  val Count: Double = js.native
  
  /** Returns the specified item in the collection by position or FilterID */
  def Item(Index: Double): Filter = js.native
  
  /** Removes the designated filter */
  def Remove(Index: Double): Unit = js.native
}
